package SrtingProbs;

import java.util.*;

public class LongestSubstringWoRep {
    public int lengthOfLongestSubstring(String s) {
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


    public static void main(String[] args) {
        LongestSubstringWoRep a = new LongestSubstringWoRep();
        int val = a.lengthOfLongestSubstring("pwwkew");
        System.out.println(val);
    }
}
