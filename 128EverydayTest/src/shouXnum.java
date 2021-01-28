import java.util.Scanner;

public class shouXnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int N=n*n;
            int count=1;
            int num=n;
            while(n>9){
                n=n/10;
                count++;
            }
            if(N%(Math.pow(10,count))==num){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }
    }
}
