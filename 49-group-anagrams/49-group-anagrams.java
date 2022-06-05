class Solution {
    public List<List<String>> groupAnagrams2(String[] strs) {
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
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> T = new HashMap<>();
        
        for(String s : strs){
            char[] cArr = s.toCharArray();
            Arrays.sort(cArr);
            if(!T.containsKey(Arrays.toString(cArr))){
                T.put(Arrays.toString(cArr), new ArrayList<>());
            }
            T.get(Arrays.toString(cArr)).add(s);
        }
        return new ArrayList<>(T.values());
    }
}