/*
* 给定一个字符串，问是否能通过增加一个字符使其变成回文串
* 思路：既然增加一个字符串可以变成回文串，减少一个也可以
* */
import java.util.Scanner;
public class addHuiwen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            System.out.println(addIsHuiwen(s));
        }
    }

    private static String addIsHuiwen(String s) {
        if(isHuiwen(s.substring(1))||isHuiwen(s.substring(0,s.length()-1))){
            return "YES";
        }
        for(int i=1;i<s.length()-1;i++){
            String str=s.substring(0,i)+s.substring(i+1);
            if(isHuiwen(str)){
                return "YES";
            }
        }
        return "NO";
    }
    private static boolean isHuiwen(String str) {
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
