import java.util.Scanner;

public class smallNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(finfL(i,arr)+" ");
            System.out.println(findR(i,arr));
        }
    }

    private static int findR(int i, int[] arr) {
        if(i==arr.length-1){
            return -1;
        }
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[i]){
                return j;
            }
        }
        return -1;
    }

    private static int finfL(int i, int[] arr) {
        if(i==0){
            return -1;
        }
        for(int j=i-1;j>=0;j--){
            if(arr[j]<arr[i]){
                return j;
            }
        }
        return -1;
    }
}
