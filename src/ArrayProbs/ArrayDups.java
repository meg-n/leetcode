package ArrayProbs;

import java.util.HashSet;

public class ArrayDups {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean a = containsDuplicate(nums);
        System.out.println(a);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!numsSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
