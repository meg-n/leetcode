class Solution {
    public String reverseWords(String s) {
        String[] st = s.split("\s+");
        Stack<String> stack= new Stack<>();
        for(String e : st){
            stack.push(e.trim());
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString().trim();
    }
}