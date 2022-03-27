class Solution {
    // public int search(int[] nums, int target) {
    //     int l = 0;
    //     int r = nums.length -1;
    //     if(nums[l] == target){
    //         return 0;
    //     }
    //     while(l<r){
    //         int mid = l + (r-l/2);
    //         if(nums[mid]==target){
    //             return mid;
    //         }
    //         else if(nums[mid]> target){
    //             r = mid -1;
    //         }
    //         else {
    //             l = mid + 1;
    //         }
    //     }
    //     return -1;
    // }
        public int search(int[] nums, int target) {
            int l = 0;
            int r = nums.length -1;
            if(nums[l] ==target) return l;
            while(l<=r){
                int m = l + (r-l)/2;
                if(nums[m] == target ) return m;
                else if(nums[m] < target ) l = m+1;
                else r= m-1;
            }
            return -1;
    }
}