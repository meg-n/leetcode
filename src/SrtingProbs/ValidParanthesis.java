package SrtingProbs;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if(stack.isEmpty())return false;
            else if (c == ')' && stack.pop() != '(') {
                return false;
            } else if (c == ']' && stack.pop() != '[') {
                return false;
            } else if (c == '}' && stack.pop() != '{') {
                return false;
            }
        }
        if (stack.size() != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        ValidParanthesis a = new ValidParanthesis();
        boolean val = a.isValid("]");
        System.out.println(val);
    }
}
