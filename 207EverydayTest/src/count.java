import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int[] arr=new int[26];
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                    arr[(int)s.charAt(i)-65]++;
                }
            }
            for(int i=0;i<26;i++){
                System.out.println((char)(i+65)+":"+arr[i]);
            }
        }
    }
}
