class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack();
        for(int i=0; i< sb.length();++i){
            if(i!=0 && sb.charAt(i) == sb.charAt(i-1)){
                int next = stack.pop() + 1;
                if(next != k)
                    stack.push(next);
                else{
                    sb.delete(i-k+1, i+1);
                    i = i-k;
                }
            } else {
                stack.push(1);
            }
        }
        return sb.toString();
    }
}