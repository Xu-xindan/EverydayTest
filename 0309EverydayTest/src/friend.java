import java.util.Arrays;
import java.util.Scanner;

public class friend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] xy = new int[k][2];
            for (int i = 0; i < k; i++) {
                xy[i][0] = sc.nextInt();
                xy[i][1] = sc.nextInt();
            }
            System.out.printf("%.2f", res(n, m, xy));
            System.out.println();
        }
    }

    private static double res(int n, int m, int[][] xy) {
        double[][] map=new double[n+1][m+1];
        for(int[] a:xy){
            map[a[0]][a[1]]=-1;
        }
        map[1][1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if (map[i][j]!=-1){
                    if(map[i-1][j]!=-1){
                        map[i][j]+=j==m?map[i-1][j]:map[i-1][j]/2;
                    }
                    if(map[i][j-1]!=-1){
                        map[i][j]+=i==n?map[i][j-1]:map[i][j-1]/2;
                    }
                }
            }
        }
        return map[n][m];
    }
}
