class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1copy = new int[nums1.length];
        for(int i =0;i<m;i++)
            nums1copy[i] = nums1[i];
            
        int p1 = 0;
        int p2 = 0;
        
        for(int i = 0;i < (m+n) ; i++){
            // add to nums1 when nums1 is smaller than nums2. Also when p2 is out of bound;
            if(p2 >= n || (p1 < m && (nums1copy[p1] < nums2[p2]))){
                nums1[i] = nums1copy[p1++];
            } else {
                nums1[i] = nums2[p2++];
            }
        }            
    }
}