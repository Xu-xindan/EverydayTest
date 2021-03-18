import java.util.Scanner;

public class pingpongBall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] strings=s.split(" ");
            String a=strings[0];
            String b=strings[1];
            System.out.println(cont(a,b));
        }
    }

    private static String cont(String a, String b) {
        int[] aNum=new int[26];
        int[] bNum=new int[26];
        for (int i = 0; i <a.length() ; i++) {
            aNum[a.charAt(i)-65]++;
        }
        for (int i = 0; i <b.length() ; i++) {
            bNum[b.charAt(i)-65]++;
        }
        for (int i = 0; i < 26; i++) {
            if(bNum[i]>aNum[i]){
                return"No";
            }
        }
        return "Yes";
    }
}
