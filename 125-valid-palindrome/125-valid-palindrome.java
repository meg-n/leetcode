class Solution {
    public boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder();
        String sClean = s.toLowerCase().replaceAll("[^a-z0-9]", "").replaceAll("\s","");
        System.out.print(sClean);
        for(Character c : sClean.toCharArray()){
                sb.append(c);
        }
        if(sb.reverse().toString().equals(sClean)) return true;
        return false;
    }    
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String sClean = s.toLowerCase().replaceAll("[^a-z0-9]", "").replaceAll("\s","");
        Stack<Character> stack = new Stack<>();
        for(Character c : sClean.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        if(sb.toString().equals(sClean))return true;
        return false;
    }
}