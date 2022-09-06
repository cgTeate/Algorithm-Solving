class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int k=0; k<nums.length; k++){
            if(nums[k]<0){
                nums[k]=0;
            }
        }
        
        for(int k=0; k<nums.length; k++){
            int val = Math.abs(nums[k]);
            if(val >= 1 && val <= nums.length){
                if(nums[val-1]>0){
                    nums[val-1] *= -1;
                }
                else if(nums[val-1]==0){
                    nums[val-1] = -1 * (nums.length+1);
                }
            }
        }
        
        for(int k=1; k< nums.length+1;k++){
            if(nums[k-1]>=0){
                return k;
            }
        }
        
        return nums.length+1;
    }
}