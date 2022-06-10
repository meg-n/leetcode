class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long maxHeight = getMax(horizontalCuts,h);
        long maxWidth= getMax(verticalCuts,w);
        long ans = 1L * maxHeight * maxWidth;
        return (int) ((maxWidth * maxHeight)% (1000000007));
    }
    public long getMax(int[] heights, int h){
        Arrays.sort(heights);
        int max = Math.max(heights[0] - 0, h-heights[heights.length-1]);
        for(int i = 1; i< heights.length;i++){
            int diff = heights[i] - heights[i-1];
            max = Math.max(max,diff);
        }
        return max;
    }
}