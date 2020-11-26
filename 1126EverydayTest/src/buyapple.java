import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class buyapple {
    public static void main1(String[] args) {
        Scanner sc =new Scanner(System.in);
        int nums=sc.nextInt();
        if(nums<6||nums%2!=0||nums==10){
            System.out.println(-1);
        }else if(nums%8==0){
            System.out.println(nums/8);
        }else {
            System.out.println(nums / 8 + 1);
        }
    }

    public static String delpublic(String O,String T){
        if(O.length()==0){
            return "";
        }else if(T.length()==0){
            return O;
        }else {
            Set<Character> todel = new TreeSet<>();
            for (char ch : T.toCharArray()) {
                todel.add(ch);
            }
            String res = "";
            for (int i = 0; i < O.toCharArray().length; i++) {
                if (!todel.contains(O.charAt(i))) {
                    res = res + O.charAt(i);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String r = delpublic(s1, s2);
        System.out.println(r);
    }
}
