import java.util.*;
public class secret {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            System.out.println(sToSecret(s1));
            System.out.println(secretToS(s2));
        }
    }

    private static String sToSecret(String s1) {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a'&&s1.charAt(i)<'z'){
                res.append((char) (s1.charAt(i) - 31));
            }else if(s1.charAt(i)=='z'){
                res.append('A');
            }else if(s1.charAt(i)>='A'&&s1.charAt(i)<'Z'){
                res.append((char)(s1.charAt(i)+33));
            }else if(s1.charAt(i)=='Z'){
                res.append('a');
            }else if(s1.charAt(i)>='0'&&s1.charAt(i)<'9'){
                res.append((char)(s1.charAt(i)+1));
            }else if(s1.charAt(i)=='9'){
                res.append('0');
            }else{
                res.append(s1.charAt(i));
            }
        }
        return res.toString();
    }

    private static String secretToS(String s1) {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>'a'&&s1.charAt(i)<='z'){
                res.append((char) (s1.charAt(i) - 33));
            }else if(s1.charAt(i)=='a'){
                res.append('Z');
            }else if(s1.charAt(i)>'A'&&s1.charAt(i)<='Z'){
                res.append((char)(s1.charAt(i)+31));
            }else if(s1.charAt(i)=='A'){
                res.append('z');
            }else if(s1.charAt(i)>'0'&&s1.charAt(i)<='9'){
                res.append((char)(s1.charAt(i)-1));
            }else if(s1.charAt(i)=='0'){
                res.append('9');
            }else{
                res.append(s1.charAt(i));
            }
        }
        return res.toString();
    }
}
