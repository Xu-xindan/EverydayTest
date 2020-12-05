import java.util.Arrays;
import java.util.Scanner;

public class GrayCode {
    public static String[] getGray(int n) {
        if(n==1){
            String[] str=new String[2];
            str[0]="0";
            str[1]="1";
            return str;
        }
        String[] t=getGray(n-1);
        String[] str=new String[2*t.length];
        for(int i=0;i<t.length;i++){
            str[i]="0"+t[i];
        }
        for(int i=0;i<t.length;i++){
            str[i+t.length]="1"+t[t.length-1-i];
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Arrays.toString(getGray(n)));
    }
}
