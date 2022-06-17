class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N =  9;
        
        HashSet<Character>[] rSet = new HashSet[N];
        HashSet<Character>[] cSet = new HashSet[N];
        HashSet<Character>[] bSet = new HashSet[N];

        for(int i = 0; i<9;i++){
            rSet[i] = new HashSet<>();
            cSet[i] = new HashSet<>();
            bSet[i] = new HashSet<>();
        }
        
        for(int r =0;r<N ;r++){
            for(int c =0;c<N;c++){
                Character val = board[r][c];
                
                if(val == '.')continue;
                
                if(rSet[r].contains(val)) return false;
                rSet[r].add(val);
                
                if(cSet[c].contains(val)) return false;
                cSet[c].add(val);
                
                int b = (r/3) * 3 + c/3;
                if(bSet[b].contains(val))return false;
                bSet[b].add(val);
            }
        }
        return true;
    }
}