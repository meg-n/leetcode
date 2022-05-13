class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int aCount  = 0, bCount = 0, cCount =0;
        int z = a+b+c;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< z; i++){
            if((a>=b && a>=c && aCount != 2) || (bCount==2 && a >0 ) || (cCount == 2 && a>0)){
                sb.append('a');
                aCount++;
                a--;
                bCount = 0;
                cCount = 0;
            } else if((b>=c && b>=a && bCount != 2) || (aCount == 2 && b>0) || (cCount == 2&& b>0)){
                System.out.print("in b");
                System.out.print("b count" + bCount);                                               System.out.print("b in" + b);
                sb.append('b');
                bCount++;
                b--;
                cCount = 0;
                aCount = 0;
            }else if((c>=a && c>=b && cCount != 2) || (bCount == 2 && c>0)|| (aCount == 2 && c>0)){
                sb.append('c');
                cCount++;
                c--;
                aCount = 0;
                bCount = 0;
                System.out.print(cCount);
            }
        }
    return sb.toString();
    }
}