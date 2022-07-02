//class Solution {
//     public int myAtoi(String s) {
//         if(s.isEmpty())
//             return 0;
//         boolean neg = false, num= false;
//         char[] c = s.toCharArray();
//         StringBuilder sb = new StringBuilder();
//         int i =0;
//         while( i<s.length() && !Character.isDigit(c[i])){
//             if( neg!=false || c[i] == '-')
//                 neg = true;
//             else if(neg!=true || c[i] == '+')
//                 neg = false;
//             else if(c[i] != ' '){
//                 return 0;
//             }
//             i++;
//         }
//         long n1 = 0;
//         while( i<s.length() && Character.isDigit(c[i])){
//             n1 = n1*10 + (c[i] - '0'); 
//             i++;
//         }
//         long res = neg == true ? -n1 : n1;
//         System.out.println(res);
//         if(res >= Integer.MAX_VALUE)
//             return Integer.MAX_VALUE;
//         else if( res <= Integer.MIN_VALUE)
//             return Integer.MIN_VALUE;
//         else 
//             return (int) res;
//     }
// }
    class Solution {
    public int myAtoi(String input) {
        int sign = 1; 
        int result = 0; 
        int index = 0;
        int n = input.length();
        
        // Discard all spaces from the beginning of the input string.
        while (index < n && input.charAt(index) == ' ') { 
            index++; 
        }
        
        // sign = +1, if it's positive number, otherwise sign = -1. 
        if (index < n && input.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < n && input.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        
        // Traverse next digits of input and stop if it is not a digit
        while (index < n && Character.isDigit(input.charAt(index))) {
            int digit = input.charAt(index) - '0';

            // Check overflow and underflow conditions. 
            if ((result > Integer.MAX_VALUE / 10) || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {     
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.    
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            // Append current digit to the result.
            result = 10 * result + digit;
            index++;
        }
        
        // We have formed a valid number without any overflow/underflow.
        // Return it after multiplying it with its sign.
        return sign * result;
    }
}