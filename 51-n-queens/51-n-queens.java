class Solution {
    private Set<Integer> col = new HashSet<>();
    private Set<Integer> posDiag = new HashSet<>();
    private Set<Integer> negDiag = new HashSet<>();
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        backtrack(result, new ArrayList<String>(),0,n);
        return result;

    }
    public void backtrack( List<List<String>> result,List<String> list, int row, int n){
        if(row == n){
            result.add(new ArrayList<String>(list));
            return;
        }
        for(int i=0;i<n; i++){
            if(col.contains(i) || posDiag.contains(row+i) || negDiag.contains(row-i)){
                continue;
            }
            char[] chArr = new char[n];
            Arrays.fill(chArr,'.');
            chArr[i] = 'Q';
            String rowString = new String(chArr);
            
            list.add(rowString);
            col.add(i);
            posDiag.add(row+i);
            negDiag.add(row-i);
            
            backtrack(result, list, row+1, n);
            
            list.remove(list.size() - 1);
            col.remove(i);
            posDiag.remove(row+i);
            negDiag.remove(row -i);
        }
    }
}