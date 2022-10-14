class Solution {
    public int numIslands(char[][] grid) {
        int islands =0;
        
        for(int k=0; k < grid.length; k++){
            for(int i=0; i < grid[0].length;i++){
                if(grid[k][i]=='1'){
                    BFS(grid, k, i);
                    islands++;
                }
            }
        }
        return islands;
    }
    
    private void BFS(char [][] grid, int row, int col){
        Queue<int []> q = new LinkedList<>();
        q.add(new int [] {row,col});
        
        while(!q.isEmpty()){
            int [] temp = q.poll();
            int rows = temp[0];
            int cols = temp[1];
            int currNum = grid[rows][cols];
            
            if(grid[rows][cols]=='0') continue;
            grid[rows][cols]='0';
            //bottom, top, right, left
            if(rows+1 < grid.length && grid[rows+1][cols]=='1'){
                q.add(new int [] {rows+1,cols});
            }
            if(rows-1 >=0 && grid[rows-1][cols]=='1'){
                q.add(new int [] {rows-1,cols});
            }
            if(cols+1 < grid[0].length && grid[rows][cols+1]=='1'){
                q.add(new int [] {rows,cols+1});
            }
            if(cols-1 >=0 && grid[rows][cols-1]=='1'){
                q.add(new int [] {rows,cols-1});
            }
        }
    }
}