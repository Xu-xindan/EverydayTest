/*
* 由右上角向左下角打印二维数组
* */
public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        int[] res=new int[n*n];
        int index=0;
        //右上部分
        for(int i=n-1;i>=0;i--){
            int k=i;
            for(int j=0;j<n-i;j++){
                res[index++]=arr[j][k++];
            }
        }
        //左下部分
        for (int i=1;i<n;i++){
            int k=i;
            for(int j=0;j<n-i;j++){
                res[index++]=arr[k++][j];
            }
        }
        return res;
    }

}