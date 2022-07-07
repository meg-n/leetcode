class Solution {
    public int[][] candyCrush(int[][] board) {
        boolean incomp = false;
        int R = board.length, C = board[0].length;
        for(int r = 0; r< R; r++){
            for(int c = 0; c + 2< C ; c++){
                int v = Math.abs(board[r][c]);
                if(v!=0 && Math.abs(board[r][c+1]) == v && Math.abs(board[r][c+2]) == v){
                    board[r][c] = board[r][c+1] = board[r][c+2] = -v;
                    incomp =true;
                }
            }
        }
        for(int r = 0; r + 2< R; r++){
            for(int c = 0; c< C ; c++){
                int v = Math.abs(board[r][c]);
                if(v!=0 && Math.abs(board[r+1][c]) == v && Math.abs(board[r+2][c]) == v){
                    board[r][c] = board[r+1][c] = board[r+2][c] = -v;
                    incomp =true;
                }
            }
        }
        
        for (int c = 0; c < C; ++c) {
            int wr = R - 1;
            for (int r = R-1; r >= 0; --r)
                if (board[r][c] > 0)
                    board[wr--][c] = board[r][c];
            while (wr >= 0)
                board[wr--][c] = 0;
        }
        return incomp ? candyCrush(board) : board;
    }
}