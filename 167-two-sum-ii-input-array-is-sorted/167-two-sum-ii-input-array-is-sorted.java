class Solution {
    public int[] twoSum2(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right = right - 1;
            } else if (sum < target) {
                left = left + 1;
            } else {
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{};
    }
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< numbers.length ; i++){
            if(map.containsKey(target - numbers[i]))
                return new int[]{map.get(target-numbers[i])+1, i+1};
            map.put(numbers[i], i);
        }
         return null;   
    }
}