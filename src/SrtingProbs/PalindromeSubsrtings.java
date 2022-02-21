package SrtingProbs;

public class PalindromeSubsrtings {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            //odd
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                count++;
                r++;
                l--;

            }//even
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                count++;
                r++;
                l--;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        PalindromeSubsrtings a = new PalindromeSubsrtings();
        int val = a.countSubstrings("aaa");
        System.out.println(val);
    }
}
