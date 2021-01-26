import java.util.Scanner;

public class addTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int N=n*n;
            int count1=0;
            int count2=0;
            while(n>9){
                count1+=n%10;
                n=n/10;
            }
            count1+=n;
            while(N>9){
                count2+=N%10;
                N=N/10;
            }
            count2+=N;
            System.out.println(count1+" "+count2);
        }
    }
}
