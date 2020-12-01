import java.util.Arrays;
import java.util.Scanner;

public class minK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            String[] str=sc.nextLine().split(" ");
            int K=Integer.parseInt(str[str.length-1]);
            int[] arr=new int[str.length-1];
            for(int j=0;j<str.length-1;j++) {
                arr[j] = Integer.parseInt(str[j]);
            }
            Arrays.sort(arr);
            for(int k=0;k<K;k++){
                System.out.print(arr[k]+" ");
            }
        }
    }

}
