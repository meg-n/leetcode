class Solution {
    public int jump(int[] nums) {
        int l =0, r=0, count = 0;
        while(r<nums.length-1){
            int lastGoodIndex = 0;
            for(int i = l; i<=r;i++){
                lastGoodIndex = Math.max(lastGoodIndex, i+ nums[i]);
            }
            count +=1 ;
            l = r+1;
            r = lastGoodIndex;

        }
        return count;
    }
}