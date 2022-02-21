package ArrayProbs;

public class MaxProdSub {
    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int l = 1, r = 1;

        for (int i = 0; i < nums.length; i++) {
            l = l == 0 ? 1 : l;
            r = r == 0 ? 1 : r;

            l *= nums[i];
            r *= nums[nums.length -1 -i];

            max = Math.max(max,Math.max(l,r));

        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};
        int max = maxProduct(nums);
        System.out.println(max);
    }
}
