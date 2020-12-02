import java.util.Scanner;

public class intchange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=Integer.toString(n);
        String string="";
        for(int i=str.length()-1;i>=0;i--){
            string=string+str.charAt(i);
        }
        System.out.println(string);
    }
}
