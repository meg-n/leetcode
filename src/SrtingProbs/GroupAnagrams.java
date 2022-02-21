package SrtingProbs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams3(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chArr = new char[26];
            for (Character c : word.toCharArray()) {
                chArr[c - 'a']++;
            }
            String sd = String.valueOf(chArr);
            if (!map.containsKey(sd)) {
                map.put(sd, new ArrayList<>());
            }
            map.get(sd).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] chArr = new char[26];
            for (Character c : word.toCharArray()) {
                chArr[c - 'a']++;
            }
            String sd = String.valueOf(chArr);
            if (!map.containsKey(sd)) {
                map.put(sd, new ArrayList<>());
            }
            map.get(sd).add(word);
        }
        return new ArrayList<>(map.values());
    }



    public static void main(String[] args) {
        GroupAnagrams a = new GroupAnagrams();
        List<List<String>> val = a.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(val);
    }
}
