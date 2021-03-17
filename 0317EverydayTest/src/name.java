import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] strings=s.split("_");
            if(strings.length==1){
                System.out.println(strings[0]);
            }else {
                StringBuilder sb=new StringBuilder(strings[0]);
                for (int i = 1; i < strings.length; i++) {
                    strings[i]=strings[i].substring(0,1).toUpperCase()+strings[i].substring(1);
                    sb.append(strings[i]);
                }
                System.out.println(sb);
            }
        }
    }
}
