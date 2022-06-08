class Solution {
    public int removePalindromeSub(String s) {
        if(s.isEmpty()) return 0;
        
        String reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)) return 1;
        
        else return 2;
    }
}