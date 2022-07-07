class Solution {
    public String decodeString(String s) {
        char[] cArr  = s.toCharArray();
        int i =0;
        int number = 0;
        StringBuilder current = new StringBuilder();
        Deque<Integer> nq = new ArrayDeque<>();
        Deque<String> cq = new ArrayDeque<>();
        while(i<cArr.length){
            if(Character.isDigit(cArr[i])){
                while(Character.isDigit(cArr[i])){
                    number= (number*10)  + (cArr[i++]-'0');
                }
            } else if(cArr[i] == '['){
                nq.push(number);
                cq.push(current.toString());
                number = 0;
                current = new StringBuilder();
                i++;
            } else if(cArr[i] == ']'){
                StringBuilder decodedString  = new StringBuilder(cq.pop());
                // decode currentK[currentString] by appending currentString k times
                for (int currentK = nq.pop(); currentK > 0; currentK--) {
                    decodedString.append(current);
                }
                current = decodedString;
                i++;
            } else{
                while(i< cArr.length && Character.isLetter(cArr[i])){
                    current.append(cArr[i++]);
                }
            }
        }                

        return current.toString();
    }
}