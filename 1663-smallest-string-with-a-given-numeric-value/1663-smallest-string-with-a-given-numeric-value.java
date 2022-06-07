class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int balance = k -n;
        while(balance>=0){
            if(balance>25){
                balance -= 25;
                sb.append('z');
                n--;
            } else {
                char c = (char) ('a' + balance);
                sb.append(c);
                n--;
                while(n>0){
                    sb.append('a');
                    n--;
                }
                break;
            }
        }
        return sb.reverse().toString();
    }
}