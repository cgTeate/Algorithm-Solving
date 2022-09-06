class Solution {
    public int singleNumber(int[] nums) {
       int res = nums[0];
        
        for (int k=1; k < nums.length; k++){
            res = nums[k] ^ res;
        }
        return res;
    }
}