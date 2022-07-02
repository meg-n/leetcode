class Solution {
    public int maxArea(int[] height) {
        int l =0, r= height.length -1, maxArea = 0;
        while(l<=r){
            int h = height[l] > height[r] ? height[r] : height[l];
            maxArea = Math.max(maxArea, h* (r-l));
            if(height[l] > height[r])
                r--;
            else 
                l++;
        }
        return maxArea;
    }
}