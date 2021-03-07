import java.util.Scanner;

public class canteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] tables=new int[n];
            for(int i=0;i<n;i++){
                tables[i]=sc.nextInt();
            }
        }
    }
}
