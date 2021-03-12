import java.util.Scanner;
public class xyRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            int x=0;int y=0;
            String[] strings=s.split(";");
            String res = "[ADWS]\\d{1}\\d?";
            for(int i=0;i<strings.length;i++){
                if(!strings[i].matches(res)){
                    return;
                }else if (strings[i].charAt(0)=='A'){
                    x=x-Integer.parseInt(strings[i].substring(1));
                }else if(strings[i].charAt(0)=='W'){
                    y=y+Integer.parseInt(strings[i].substring(1));
                }else if(strings[i].charAt(0)=='S'){
                    y=y-Integer.parseInt(strings[i].substring(1));
                }else if(strings[i].charAt(0)=='D'){
                    x=x+Integer.parseInt(strings[i].substring(1));
                }
            }
            System.out.println(x+","+y);
        }
    }
}
