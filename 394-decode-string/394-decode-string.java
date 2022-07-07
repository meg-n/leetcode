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
                nq.push(number);
                number =0;
            } else if(cArr[i] == '['){
                cq.push(current.toString());
                current = new StringBuilder();
                i++;
            } else if(cArr[i] == ']'){
                StringBuilder temp = new StringBuilder(cq.pop());
                int c = nq.pop();
                for(int j =0;j<c;j++){
                    temp.append(current);
                }
                current = temp;
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