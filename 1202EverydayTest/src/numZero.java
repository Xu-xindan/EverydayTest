import java.util.Scanner;

public class numZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int t=i;
            while(t%5==0){
                count++;
                t=t/5;
            }
        }
        System.out.println(count);
    }
}
