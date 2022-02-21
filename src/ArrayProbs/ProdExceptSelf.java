package ArrayProbs;

public class ProdExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int prod[] = productExceptSelf(nums);
        for(Integer i : prod) {
            System.out.println(i);
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int left =1,right =1;
        int[] output = new int[nums.length];
        for(int i = nums.length-1;i>=0;i--){
            output[i] = right;
            right *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            output[i] *= left;
            left *= nums[i];
        }

        return output;
    }
}
