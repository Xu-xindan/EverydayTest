import java.util.Scanner;

public class maxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=-1;
            int sum=0;
            for (int i = 0; i <n ; i++) {
                if(sum+arr[i]>arr[i]){
                    sum+=arr[i];
                }else{
                    sum=arr[i];
                }
                max=Math.max(max,sum);
            }
            System.out.println(max);
        }
    }
}
