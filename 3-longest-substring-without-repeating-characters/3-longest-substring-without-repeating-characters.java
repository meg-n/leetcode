class Solution {
    // O(n)
    public int lengthOfLongestSubstring1(String s) {
        char[] charArr = s.toCharArray();
        int l = 0, r = 0, length = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        while (l <= r && r < charArr.length) {
            if (charMap.containsKey(charArr[r])) {
                charMap.remove(charArr[l]);
                l++;
            } else {
                charMap.put(charArr[r], r);
                length = Math.max(length, (r - l+1));
                r++;
            }
        }
        return length;
    }
    public int lengthOfLongestSubstring(String s) {
        int l =0, r =0, length =0;
        char[] cArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        while(l<=r && r<s.length()){
            if(!map.containsKey(cArr[r])){
                length = Math.max(length, (r-l+1));
                map.put(cArr[r],r);
                r++;
            } else {
                map.remove(cArr[l]);
                l++;
            }
        }
        return length;
    }
}