class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '[' || c== '{'){
                stack.push(c);
                continue;
            } 
            if(stack.isEmpty()) return false;
            if( c== ')' && stack.pop() != '(') return false;
            else if(c == ']' && stack.pop()!= '[') return false;
            else if(c == '}' && stack.pop() != '{') return false;
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}