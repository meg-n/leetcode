package ArrayProbs;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int right = nums.length -1;
        int left = 0;
        while (left < right){
            int mid = left + (right-left)/ 2;
            System.out.print(left + " " + mid + " " + right);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        search(nums, 9);
    }
}
