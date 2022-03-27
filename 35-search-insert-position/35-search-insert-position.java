class Solution {
    // public int searchInsert(int[] nums, int target) {
    //     int l = 0, r = nums.length -1;
    //     while(l<r){
    //         int m = l + (r-l)/2;
    //         if(target > nums[m]){
    //             l = m+1;
    //         } else if(target <nums[m]){
    //             r = m-1;
    //         } else {
    //             return m;
    //         }
    //     }
    //     if(target>nums[r]) return r+1;
    //     else return r;
    // }
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;

        if(target<nums[l]) return l;
        while(l<r){
            int m = l + (r-l)/2;
            if(nums[m] == target) return m;
            else if( nums[m] < target) l = m+1;
            else r = m-1;
        }
        if(target>nums[r])return r+1;
        else return r;
    }
}