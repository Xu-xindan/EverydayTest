import java.util.Scanner;

public class longstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int max=0;
            int count=0;
            int endIndex=0;
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    count++;
                    if(max<count){
                        max=count;
                        endIndex=i;
                    }
                }else{
                    count=0;
                }
            }
            System.out.println(str.substring(endIndex-max+1,endIndex+1));
        }
    }

    public boolean chkParenthesis(String A, int n) {
        int count1=0;
        int count2=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('){
                count1++;
            }else if(A.charAt(i)==')'){
                count2++;
            }else{
                return false;
            }
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}
