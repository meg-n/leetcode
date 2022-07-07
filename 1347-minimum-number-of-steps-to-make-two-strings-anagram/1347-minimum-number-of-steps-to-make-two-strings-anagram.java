class Solution {
    public int minSteps(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        int count = 0;
        int[] c = new int[26]; 

        for(int i = 0;i<s.length();i++){
            c[sa[i] - 'a']++;
            c[ta[i] - 'a']--;
        }
        for(int n : c){
            count = n >0? count + n : count + 0;
        }
        return count;
    }
}