import java.util.Scanner;

public class longest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
                String sb="";
                sb=sb+str.charAt(i);
                for(int j=i+1;j<str.length();j++) {
                    if(str.charAt(j)>='0'&&str.charAt(j)<='9') {
                        sb = sb + str.charAt(j);
                    }else{
                        break;
                    }
                }
                res=res.length()>sb.length()?res:sb;
            }else{
                continue;
            }
        }
        System.out.println(res);
    }
}
