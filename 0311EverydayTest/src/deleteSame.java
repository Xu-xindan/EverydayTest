import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class deleteSame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String d=sc.nextLine();
            StringBuilder res= new StringBuilder();
            Set<Character> set=new HashSet<>();
            for (int i = 0; i < d.length(); i++) {
                set.add(d.charAt(i));
            }
            for (int i = 0; i < s.length(); i++) {
                if (!set.contains(s.charAt(i))){
                    res.append(s.charAt(i));
                }
            }
            System.out.println(res);
        }
    }
}
