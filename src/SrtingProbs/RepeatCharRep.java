package SrtingProbs;

import java.util.HashMap;
import java.util.Map;

public class RepeatCharRep {
    public int characterReplacement(String s, int k) {
        char[] charArr = s.toCharArray();
        int l = 0, r = 0, n = charArr.length, length = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        while (l <= r && r < n) {
            int freq = charMap.get(charArr[r]) == null ? 0 : charMap.get(charArr[r]);
            freq += 1;
            charMap.put(charArr[r], freq);
            int max = -1;
            for (Integer i : charMap.values()) {
                max = Math.max(max, i);
            }
            int windowSize = r - l + 1;
            if ((windowSize - max) <= k) {
                length = Math.max(length, windowSize);
                r++;
            } else {
                int f = charMap.get(charArr[l]);
                f -= 1;
                charMap.put(charArr[l], f);
                l++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        RepeatCharRep a = new RepeatCharRep();
        int val = a.characterReplacement("AABABBA", 1);
        System.out.println(val);
    }
}
