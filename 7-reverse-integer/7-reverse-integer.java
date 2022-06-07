class Solution {
    public int reverse(int x) {
        boolean neg =false;
        int sum = 0;
        if(x<0) {
            neg = true;
            x = -x;
        }
        while(x >0) {
            int pop = x%10;

            
            if(sum >  Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && pop > Integer.MAX_VALUE%10  )) return 0;
            sum = (sum*10) + pop;
            x /= 10;
        }
    return neg? -sum:sum;
    }
}