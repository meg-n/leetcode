class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> q = new ArrayDeque<>();
        int fresh = 0;
        for(int i = 0 ; i< grid.length; i++){
            for(int j = 0; j< grid[0].length;j++){
                if(grid[i][j] == 2)
                    q.offer(new Pair(i,j));
                else if(grid[i][j] == 1)
                    fresh++;
            }
        }
        
        q.offer(new Pair(-1,-1));
        int min = -1;
        int[][] directions = {{-1,0}, {0,1}, {1,0}, {0,-1}};
        while(!q.isEmpty()){
             Pair<Integer, Integer> p= q.poll();
             int r = p.getKey();
              int c = p.getValue();
                if(r == -1){
                    min++;
                    if(!q.isEmpty())
                        q.offer(new Pair(-1,-1));
                } else {
                    for(int[] d : directions){
                        int nr = r +d[0];
                        int nc = c + d[1];
                        if(nr >= 0 && nr < grid.length && nc >=0 && nc < grid[0].length){
                            if(grid[nr][nc] == 1){
                            grid[nr][nc] = 2;
                            fresh--;
                            q.offer(new Pair(nr, nc));
                            } 
                        }
                    }
                }
            
        }
        return fresh == 0? min : -1;
    }
}