import java.util.Scanner;

public class wordReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z')){
                sb.append(s.charAt(i));
            }else{
                sb.append(" ");
            }
        }
        s=sb.toString();
        String[] strings=s.split(" ");
        String res="";
        for(int i=strings.length-1;i>=0;i--){
           if(!strings[i].equals(" ")){
               res=res+strings[i]+" ";
           }
        }
        System.out.println(res);
    }
}
