class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        if(s1.equals(s2)) return true;
        char[] c = s1.toCharArray();
        int[] cmap = new int[26];
        for(Character c3 : s1.toCharArray()){
            cmap[c3-'a']++;
        }
        
        for(int r = 0; r< s2.length() -1;r++){
            if(r+s1.length()> s2.length()) break;
            String s = s2.substring(r, r + s1.length());
            int[] c1Map = new int[26];
            for(Character c4 : s.toCharArray()){
                c1Map[c4-'a']++;
            }
            if ( Arrays.equals(cmap,c1Map))return true;
        }

        return false;
    }
}