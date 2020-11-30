import java.util.Scanner;

public class Max {
    public static int minnum(int m,int n){
        if(m<n){
            int t=m;
            m=n;
            n=t;
        }
        int max=1;
        for(int i=n;i>0;i--){
            if(m%i==0&&n%i==0){
                max=i;
                break;
            }
        }
        return (m*n/max);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(minnum(a,b));
    }
}
