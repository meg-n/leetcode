class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int longest = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int current = n;
                int currentStreak = 1; 
                
                while(set.contains(current+1)){
                    current += 1;
                    currentStreak += 1;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}