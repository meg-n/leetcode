package ArrayProbs;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right = right - 1;
            } else if (sum < target) {
                left = left + 1;
            } else {
                output[0] = left+1;
                output[1] = right+1;
                return output;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] n = twoSum(nums, 9);
        System.out.println(n[0] + " " + n[1]);
    }
}
