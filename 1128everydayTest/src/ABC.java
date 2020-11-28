import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(((a+c)%2!=0)|| ((b+d)%2!=0)){
            System.out.println("No");
        }else{
            int A=(a+c)/2;
            int B=c-A;
            int C=d-B;
            if(A>=0&&B>=0&&C>=0){
                System.out.println(A+" "+B+" "+C+" ");
            }else{
                System.out.println("No");
            }
        }
    }
}
