import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int count=0;
        int[][] a=new int[1000][1000];
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                if(a[i][j]==0) {
                    count++;
                    if(i+2<w){
                        a[i][j]=-1;
                    }
                    if(j+2<h){
                        a[i][j]=-1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
