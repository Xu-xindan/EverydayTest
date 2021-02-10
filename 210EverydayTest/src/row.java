public class row {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;

        int[][]dp = new int[row][col];
        int max = 0;
        //把每个位置都搜索一遍
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                max = Math.max(max, search(matrix, Integer.MIN_VALUE, i, j, dp));
            }
        }
        return max;
    }

    private int search(int[][]matrix, int curNum, int i , int j, int[][]dp){
        int row = matrix.length;
        int col = matrix[0].length;
        //看一下是不是数组越界
        if (i < 0 || i >= row || j < 0 || j >= col || matrix[i][j] <= curNum) return 0;
        if (dp[i][j] != 0) return dp[i][j];

        int max = 0;
        //四个方向去搜索，找到最大的那个
        max = Math.max(max, search(matrix, matrix[i][j], i - 1, j, dp));
        max = Math.max(max, search(matrix, matrix[i][j], i + 1, j, dp));
        max = Math.max(max, search(matrix, matrix[i][j], i, j - 1, dp));
        max = Math.max(max, search(matrix, matrix[i][j], i, j + 1, dp));
        //更新当前数组的位置
        dp[i][j] = max + 1;
        return max + 1;
    }
}
