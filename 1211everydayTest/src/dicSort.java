import java.util.Scanner;
import java.util.Stack;

public class dicSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            Stack<Integer> train=new Stack<>();
            for(int i=0;i<n;i++){
                train.push(array[i]);
                System.out.print(train.pop()+" ");
            }
        }
    }
}
