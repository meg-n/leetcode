package SrtingProbs;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Locale;

public class Palindrome {
    public boolean isPalindrome1(String s) {
        boolean isPal = false;
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str.toLowerCase().toCharArray();
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString().equalsIgnoreCase(str);
    }

    public boolean isPalindrome(String s) {
        boolean isPal = false;
        int l = 0, r = s.length() - 1;
        char[] chArr = s.toCharArray();
        while (l < r) {
            if (!Character.isLetter(chArr[l])) {
                l++;
            } else if (!Character.isLetterOrDigit(chArr[r])) {
                r--;
            } else {
                if (Character.toLowerCase(chArr[l]) != Character.toLowerCase(chArr[r])) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome a = new Palindrome();
        boolean val = a.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(val);
    }
}
