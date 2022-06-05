class Solution {
    public int characterReplacement(String s, int k) {
        int l =0, length =0, repeat =0;
        Map<Character, Integer> map =new HashMap<>();
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c,0) +1);
            repeat = Math.max(repeat, map.get(c));
            
            if(r-l+1 - repeat > k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;
            }
            length = Math.max(length, r-l+1);
        }
        return length;
    }
}