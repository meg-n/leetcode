package ArrayProbs;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right] + nums[i];
                    if (sum > 0) {
                        right = right - 1;
                    } else if (sum < 0) {
                        left = left + 1;
                    } else {
                        List<Integer> trip = new ArrayList<>();
                        trip.add(nums[left]);
                        trip.add(nums[right]);
                        trip.add(nums[i]);
                        op.add(trip);
                        left += 1;
                        while (nums[left] == nums[left - 1] && left < right) left += 1;
                    }
                }
            }
        }
        return op;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        List<List<Integer>> op = ts.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (List<Integer> inList : op) {
            System.out.println(inList);
        }
    }
}
