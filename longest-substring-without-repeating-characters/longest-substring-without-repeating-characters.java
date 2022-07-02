class Solution {
    // O(n)

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, len = 0;
        
        while( l<=r && r< s.length()){
            if(!map.containsKey(s.charAt(r))){
                len = Math.max(len, (r-l+1));
                map.put(s.charAt(r), r);
                r++;
            } else{
                map.remove(s.charAt(l));
                l++;
            }
        }
        return len;
    }

}