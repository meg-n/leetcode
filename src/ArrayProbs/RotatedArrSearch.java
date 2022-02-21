package ArrayProbs;

public class RotatedArrSearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            // left sorted portion
            if (nums[mid] >= nums[left]) {
                if (target > nums[mid]) {
                    left = mid + 1;
                } else if (target >= nums[left]) {
                    right = mid - 1;
                } else if (target < nums[left]) {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[right] >= target) {
                    left = mid + 1;
                } else if (nums[right] < target) {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 3};
        int n = search(nums, 3);
        System.out.println(n);
    }
}
