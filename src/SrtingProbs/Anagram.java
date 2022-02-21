package SrtingProbs;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Anagram a = new Anagram();
        boolean val = a.isAnagram("anagram", "anagrma");
        System.out.println(val);
    }

    public boolean isAnagram1(String s, String t) {
        int sum1 = 0, prod1 = 1;
        if (s.length() != t.length()) {
            return false;
        }
        for (Character c : s.toCharArray()) {
            sum1 += c;
            prod1 *= c;
        }
        int sum2 = 0, prod2 = 1;
        for (Character c : t.toCharArray()) {
            sum2 += c;
            prod2 *= c;
        }
        if (sum1 == sum2 && prod1 == prod2) {
            return true;
        }
        return false;
    }

    private static boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.toString(s1).equals(Arrays.toString(t1));
    }
}
