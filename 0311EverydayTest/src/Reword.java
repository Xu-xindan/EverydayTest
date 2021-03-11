import java.util.Scanner;

public class Reword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] strings=str.split(" ");
            String res="";
            for (int i = strings.length-1; i >=0; i--) {
                res+=strings[i]+" ";
            }
            res=res.substring(0,res.length()-1);
            System.out.println(res);
        }
    }
}
