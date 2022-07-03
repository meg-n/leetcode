class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0, max = Integer.MIN_VALUE;
        
        for(int i : nums){
            current = Math.max(i, current+i);
            max = Math.max(max, current);
        }
        return max;
    }
}