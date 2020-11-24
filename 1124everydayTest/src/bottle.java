import java.util.Scanner;

public class bottle {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n=sc.nextInt();
            if(n==1){
                System.out.println(0);
            }
            System.out.println(n/2);
        }
    }

    public int count(int[] A, int n) {
        if(A.length<=1){
            return 0;
        }
        // write code here
        int count=0;
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
