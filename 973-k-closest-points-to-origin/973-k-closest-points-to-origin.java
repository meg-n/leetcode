class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, (a,b) -> dis(a) - dis(b));
        int[][] result = new int[k][];
        return Arrays.copyOf(points,k);
    }
    private int dis(int[] point){
        return (int)(Math.pow(point[0],2) + Math.pow(point[1],2));
    }
}