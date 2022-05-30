class Solution {
    public void dfs(char[][] grid, int r, int c){
        int num_row = grid.length;
        int num_col = grid[0].length;
        
        if(r>=num_row || c>=num_col || r<0 || c<0 || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);

    }
    public int numIslands(char[][] grid) {
       int num = 0; 
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               if(grid[i][j] == '1'){
                num += 1;  
                dfs(grid, i, j);   
               }
           }
       } 
       return num; 
    }
}