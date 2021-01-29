import java.util.Scanner;

public class countSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=sc.nextInt();
        long[] dp=new long[sum+1];
        dp[0]=1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            for(int j=sum;j>=0;j--){
                if(j>=arr[i]){
                    dp[j]+=dp[j-arr[i]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}

