class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long maxHeight = getMax(horizontalCuts,h);
        long maxWidth= getMax(verticalCuts,w);
        long ans = 1L * maxHeight * maxWidth;
        return (int) ((maxWidth * maxHeight)% (1000000007));
    }
    public long getMax(int[] heights, int h){
        Arrays.sort(heights);
	    int len = 0, st = 0;
	    for (int i : heights) {
		    len = Math.max(i - st, len);
		    st = i;
	    }
	    len = Math.max(len, h - st);
        return len;
    }
}