import java.util.Scanner;

public class Nfib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=0;
        while(Fib(i)<=N){
            i++;
        }
        int a=Fib(i)-N;
        int b=N-Fib(i-1);
        System.out.println(a>b?b:a);
    }
    public static int Fib(int n){
        if(n==0||n==1){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }
}
