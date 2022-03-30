class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right =nums.length-1;
        int[] result = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int square = 0;
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                square = nums[left]*nums[left];
                left++;
            } else{
                square = nums[right]* nums[right];
                right--;
            }
            result[i] = square;
        }
        return result;
    }
}