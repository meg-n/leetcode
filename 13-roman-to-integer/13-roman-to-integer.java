class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        char[] c = s.toCharArray();
        int num = 0, i=0;
        while( i < s.length()){
            if(( i< s.length() -1) && (map.get(c[i]) < map.get(c[i+1]))){
                num += map.get(c[i+1]) - map.get(c[i]);
                i = i+2;
            } else {
                System.out.println(map.get(c[i])+" " +i);
                num += map.get(c[i]);
                i = i+1;
            } 
        }
        return num;
    }
}