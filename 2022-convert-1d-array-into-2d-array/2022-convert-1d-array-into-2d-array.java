class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(m*n!=original.length) return new int[][]{};
        int[][] arr=new int[m][n];
        int index=0;
        for(int i=0;i<m;i++){
            for(int k=0;k<n;k++){
                arr[i][k]=original[index];
                index++;
            }
        }
        return arr;
    }
}