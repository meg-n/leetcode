class Solution {
    public int firstUniqChar3(String s) {
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i =0; i<s.length();i++){
            if(!set.add(s.charAt(i))){
                map.remove(s.charAt(i));
            }else{
            map.put(s.charAt(i),i);
            }
        }
        if(map.size() < 1)
            return -1;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            return entry.getValue();
        }
       // return entry.getValue();
                return -1;

    }
    public int firstUniqChar(String s) {
        char[] freq = new char[26];
        for(Character c : s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i = 0 ; i< s.length();i++){
            if(freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }    
}