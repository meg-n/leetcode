class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        if(s1.equals(s2)) return true;
        char[] c = s1.toCharArray();
        Arrays.sort(c);
        
        for(int r = 0; r< s2.length() -1;r++){
            if(r+s1.length()> s2.length()) break;
            String s = s2.substring(r, r + s1.length());
            char[] c1 = s.toCharArray();
            Arrays.sort(c1);
            if ( Arrays.equals(c,c1))return true;
        }

        return false;
    }
}