class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String log1, String log2){
                String[] ls1 = log1.split(" ",2);
                String[] ls2 = log2.split(" ",2);
                
                boolean isLs1Digit = Character.isDigit(ls1[1].charAt(0));
                boolean isLs2Digit = Character.isDigit(ls2[1].charAt(0));
                
                //1. both letters
                if(!isLs1Digit && !isLs2Digit ){
                    int content_compare = ls1[1].compareTo(ls2[1]);
                    if(content_compare!=0){
                        return content_compare;
                    }
                    return ls1[0].compareTo(ls2[0]);
                }
                // 2. 1st letter 2nd digit
                else if(!isLs1Digit && isLs2Digit){
                    return -1;
                }
                // 3. 1st digit 2nd letter
                else if(isLs1Digit && !isLs2Digit){
                    return 1;
                }
                // 4. both digit
                else{
                    return 0;
                }

            }
        };
        Arrays.sort(logs,comp);
        return logs;
    }
}