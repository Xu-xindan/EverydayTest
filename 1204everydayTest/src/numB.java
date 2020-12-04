import java.util.Scanner;

public class numB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] num={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-48]++;
        }
        for(int i=0;i<10;i++){
            if(num[i]!=0){
                System.out.printf("%d:%d\n",i,num[i]);
            }
        }
    }
}
