class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int [nums.length];
        int temp =1;
        for(int k=0; k< nums.length;k++){
            res[k] = temp;
            temp *= nums[k];
        }
        
        temp =1;
        
        for(int i=nums.length-1; i>=0;i--){
            res[i] *= temp;
            temp *= nums[i];
        }
        return res;
    }
}