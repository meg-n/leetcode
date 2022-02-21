package ArrayProbs;

public class RotatedArrMin {
    public static int findMin(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] <= nums[hi]) hi = mid;
            else lo = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3};
        int n = findMin(nums, 3);
        System.out.println(n);
    }
}
