class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        boolean a = Arrays.toString(s1).equals(Arrays.toString(t1))? true :  false; 
        return a;
    }
}