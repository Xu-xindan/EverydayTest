public class dfsJuHen {
    public boolean exist(char[][] board, String word) {
        char[] words=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,words,i,j,0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if(words[k]!=board[i][j]||i<0||i>=board.length||j<0||j>=board[0].length) return false;
        if(k==words.length-1) return true;
        board[i][j]='\0';
        boolean res=dfs(board,words,i+1,j,k+1)||dfs(board,words,i,j+1,k+1)
                ||dfs(board,words,i-1,j,k+1)||dfs(board,words,i,j-1,k+1);
        board[i][j]=words[k];
        return res;
    }
}
