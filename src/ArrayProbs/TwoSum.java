package ArrayProbs;

import java.util.HashMap;

class TwoSum {

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap != null && numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]),i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum ts = new TwoSum();
        int[] s = ts.twoSum(nums, target);
        System.out.println(s[0] + " " + s[1]);
    }
}