package SrtingProbs;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int resL = 0, resR = 0, resLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            //odd
            while (l >= 0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLength) {
                    resLength = r - l + 1;
                    resL = l;
                    resR = r;
                }
                r++;
                l--;

            }//even
            l = i;
            r = i + 1;
            while (l >= 0 && r<s.length()  && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLength) {
                    resLength = r - l + 1;
                    resL = l;
                    resR = r;
                }
                r++;
                l--;

            }
        }
        return s.substring(resL, resR+1);
    }

    public static void main(String[] args) {
        LongestPalindrome a = new LongestPalindrome();
        String val = a.longestPalindrome("cbbd");
        System.out.println(val);
    }
}
