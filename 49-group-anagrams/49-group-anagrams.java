class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chArr = new char[26];
            for(Character c : s.toCharArray()){
                chArr[c-'a']++;
            }
            String anagram = String.valueOf(chArr); 
            if(!map.containsKey(anagram)){
                map.put(anagram, new ArrayList<>());
            } 
            map.get(anagram).add(s);
                
        }

        return new ArrayList<>(map.values());
    }
}