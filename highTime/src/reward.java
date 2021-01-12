public class reward {
    public int getMost(int[][] board) {
        return getMost(board,5,5);
    }

    private int getMost(int[][] board, int i, int j) {
        if(i==0&&j==0){
            return board[i][j];
        }
        if(i==0){
            return board[i][j]+getMost(board,i,j-1);
        }
        if(j==0){
            return board[i][j]+getMost(board,i-1,j);
        }
        return board[i][j]+Math.max(getMost(board,i,j-1),getMost(board,i-1,j));
    }
}

