import java.util.Scanner;

public class sayReturn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] strings=s.split(" ");
        int len=strings.length;
        for(int i=0;i<len/2;i++){
            String t=strings[i];
            strings[i]=strings[len-1-i];
            strings[len-1-i]=t;
        }
        String sb="";
        for(int i=0;i<len-1;i++){
            sb=sb+strings[i]+" ";
        }
        sb=sb+strings[len-1];
        System.out.println(sb);
    }
}
