import java.util.Arrays;
import java.util.Scanner;

public class zhengZe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for (int i = 0; i <n ; i++) {
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        int count=0;
        for (int i = 0; i <n ; i++) {
            count+=Math.abs(i+1-num[i]);
        }
        System.out.println(count);
    }
}
