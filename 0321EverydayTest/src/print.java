public class print {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        int startX=0;
        int endX=m-1;
        int startY=0;
        int endY=n-1;
        int index=0;
        int[] res=new int[m*n];
        if(mat==null){
            return res;
        }
        while (startX <= endX && startY <= endY) {
            // 从左到右打印
            if(startX <= endX){
                for (int i = startX; i <= endX; i++) {
                    res[index++] = mat[startY][i];
                }
            }
            // 从上往下打印
            if (startY < endY) {
                for (int i = startY + 1; i <= endY; i++) {
                    res[index++] = mat[i][endX];
                }
            }
            // 从右往左打印
            if (startX < endX && endY > startY) {
                for (int i = endX - 1; i >= startX; i--) {
                    res[index++] = mat[endY][i];
                }
            }
            // 从下往上打印
            if (startY < endY && endX > startX) {
                for (int i = endY - 1; i >= startY + 1; i--) {
                    res[index++] = mat[i][startX];
                }
            }
            startX++;
            endX--;
            startY++;
            endY--;
        }
        return res;
    }
}
