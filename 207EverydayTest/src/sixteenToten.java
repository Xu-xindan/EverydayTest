import java.util.Scanner;

public class sixteenToten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            s=s.substring(2);
            int[] arr=new int[s.length()];
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)>='A'){
                    arr[i]=s.charAt(i)-65+10;
                }else {
                    arr[i]=s.charAt(i)-48;
                }
            }
            int count=0;
            int h=1;
            for(int i=s.length()-1;i>=0;i--){
                count+=h*arr[i];
                h*=16;
            }
            System.out.println(count);
        }
    }
}
