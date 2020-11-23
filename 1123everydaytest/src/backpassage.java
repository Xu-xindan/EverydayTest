import java.util.Scanner;

public class backpassage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int count=0;
        for(int i=0;i<A.length()+1;i++){
            String C=A.substring(0,i)+B+A.substring(i);
            if(isback(C)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isback(String c) {
        for(int i=0;i<c.length()/2;i++){
            if(c.charAt(i)!=c.charAt(c.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
