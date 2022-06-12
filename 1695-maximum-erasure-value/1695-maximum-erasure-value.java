class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int l = 0, r = 0;
        int sum= 0, maxSum =0;
        while(l<=r && r < nums.length){
            if(set.add(nums[r])) {
                sum += nums[r++];
            }
            else {
                set.remove(nums[l]);
                sum -= nums[l++];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return Math.max(sum, maxSum);
    }
}