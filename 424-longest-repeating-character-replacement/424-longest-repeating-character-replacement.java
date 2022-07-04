class Solution {
    public int characterReplacement(String s, int k) {
        int l =0, repeat = 0, len = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
            repeat = Math.max(repeat, map.get(c));
            
            if(i-l+1 - repeat > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            len = Math.max(len, (i-l+1));
            
        }
        return len;
    }
}