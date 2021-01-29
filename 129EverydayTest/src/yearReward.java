import java.util.Scanner;

public class yearReward {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            double mul = 1;
            for(int i=2;i<=n;i++){
                mul*=i;
            }
            System.out.printf("%.2f%%",count(n)/mul*100);
            System.out.println();
        }
    }

    private static float count(int n) {
        if(n==1||n==2){
            return n-1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
}
