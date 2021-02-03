import java.util.Scanner;

public class nStairs {
    public static int countWays(int n) {
        int[] arr=new int[n];
        if(n==1||n==2){
            return n;
        }
        if(n==3){
            return 4;
        }
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        for(int i=3;i<n;i++){
            arr[i]=(arr[i-1]+arr[i-2]+arr[i-3])%1000000007;
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(countWays(n));
        }
    }
}
