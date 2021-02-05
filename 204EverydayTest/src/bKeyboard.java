import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class bKeyboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String r=sc.next().toUpperCase();
        String d=sc.next().toUpperCase();
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<d.length();i++){
            set.add(d.charAt(i));
        }
        for(int i=0;i<r.length();i++){
            if(set.contains(r.charAt(i))){
                set.remove(r.charAt(i));
            }
        }
        for(char c:set){
            System.out.print(c);
        }
    }
}
