import java.util.Arrays;
import java.util.Scanner;

public class outLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(upPeople(n,x,y,arr));
    }
    private static int upPeople(int n,int x,int y,int[] arr){
        if(n<2*x||n>2*y){
            return -1;
        }
        int left = x;
        int right = y+1;
        while(left < right){
            int mid = left+(right-left)/2;
            if(n-mid >=x || n-mid <=y){
                right =mid;
            }else{
                left =mid+1;
            }
        }
        return arr[left-1];
    }
}
