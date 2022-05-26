class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        numList.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i] > numList.get(numList.size() -1 )){
                numList.add(nums[i]);
            }else{
                int j= 0;
                while(nums[i]> numList.get(j)){
                    j += 1;
                }
                numList.set(j,nums[i]);
            }
        }
        return numList.size();
    }
}