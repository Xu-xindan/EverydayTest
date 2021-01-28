import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            System.out.println(isCorrect(str));
        }
    }

    private static String isCorrect(String str) {
        if(str.length()<=8){
            return "NG";
        }
        int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                count1=1;
            }else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                count2=1;
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                count3=1;
            }else{
                count4=1;
            }
        }
        if(count1+count2+count3+count4<3){
            return "NG";
        }
        for(int i=0;i<str.length()-2;i++){
            String s=str.substring(i,i+3);
            if(str.substring(i+1).contains(s)){
                return "NG";
            }
        }
        return "OK";
    }
}
