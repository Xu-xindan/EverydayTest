import java.util.Scanner;

public class openPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String res="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    res=res+str.charAt(i);
                }else if(str.charAt(i)>='A'&&str.charAt(i)<='E'){
                    res=res+(char)(str.charAt(i)+21);
                }else if(str.charAt(i)>='F'&&str.charAt(i)<='Z'){
                    res=res+(char)(str.charAt(i)-5);
                }
            }
            System.out.println(res);
        }
    }
}
