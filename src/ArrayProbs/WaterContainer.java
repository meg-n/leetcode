package ArrayProbs;

public class WaterContainer {
    //brute force
    public int maxAreaBF(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int h = height[j] > height[i] ? height[i] : height[j];
                int area = (j - i) * (h);
                if (maxArea < area) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int minHeight = height[left] > height[right] ? height[right] : height[left];
            int area = (right - left) * minHeight;
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }

        }
        return maxArea;
    }

    public static void main(String[] args) {
        WaterContainer ts = new WaterContainer();
        int[] heights = {1, 1};
        int maxArea = ts.maxArea(heights);
        System.out.println(maxArea);
    }
}
