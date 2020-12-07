import java.util.Scanner;

public class obama {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String str=sc.next();
        char c=str.charAt(0);
        for(int i=0;i<N;i++){
            System.out.print(c);
        }
        System.out.println();
        for(int i=0;i<(N+1)/2-2;i++){
            System.out.print(c);
            for(int j=0;j<N-2;j++){
                System.out.print(" ");
            }
            System.out.print(c+"\n");
        }
        for(int i=0;i<N;i++){
            System.out.print(c);
        }
    }
}
