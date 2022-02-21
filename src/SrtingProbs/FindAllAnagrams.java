package SrtingProbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {

    public List<Integer> findAnagrams1(String s, String p) {
        char[] pSort = p.toCharArray();
        Arrays.sort(pSort);
        List<Integer> anagramIndexList = new ArrayList<>();
        int left = 0, right = left + p.length() - 1;
        while (left <= right && right < s.length()) {
            char[] sSubArray = s.substring(left, right + 1).toCharArray();
            Arrays.sort(sSubArray);
            if (Arrays.equals(pSort, sSubArray)) {
                anagramIndexList.add(left);
            }
            right++;
            left++;
        }

        return anagramIndexList;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anas = new ArrayList<>();
        if (p.length() > s.length()) {
            return anas;
        }
        char[] pArr = p.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= p.length(); i++) {
            Integer m = map.get(pArr[i]);
            int count = m!= null ? m++: 0;
            map.put(pArr[i], count);
        }
        char[] sArr = s.toCharArray();
        int r=0,l=0;
        while(l<=r){
            //if(map.get(s[l]) =)
        }
        return  anas;
    }

    public static void main(String[] args) {
        FindAllAnagrams a = new FindAllAnagrams();
        List<Integer> val = a.findAnagrams("acdcaeccde"
                , "c");
        System.out.println(val);
    }
}
