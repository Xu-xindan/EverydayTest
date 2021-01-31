import java.util.Arrays;
import java.util.Scanner;

public class arrJishuGe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int i=0;
            while(i<n){
                int tag=arr[i];
                int count=0;
                for(int j=i;j<n;j++){
                    if(arr[j]==tag){
                        count++;
                    }else{
                        break;
                    }
                }
                i=i+count;
                if(count%2==1){
                    System.out.print(tag+" ");
                }
            }

    }
}
