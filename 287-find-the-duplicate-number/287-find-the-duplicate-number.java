class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(!numSet.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
}