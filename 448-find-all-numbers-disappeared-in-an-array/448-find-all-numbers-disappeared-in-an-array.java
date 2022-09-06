class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int k=0; k<nums.length;k++){
            if(!set.contains(nums[k])){
                set.add(nums[k]);
            }
            }
        
        for(int k =1; k<nums.length+1; k++){
                if(!set.contains(k)){
                    list.add(k);
                }
            }
            return list;
    }
}