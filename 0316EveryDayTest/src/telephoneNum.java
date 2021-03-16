import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class telephoneNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            ArrayList<String> arrayList=new ArrayList<>();
            for(int i=0;i<n;i++){
                String s=sc.nextLine();
                s.replace("-","");
                String res=sToNum(s);
                String r=res.substring(0,3)+'-'+res.substring(3,7);
                if(!arrayList.contains(r)) {
                    arrayList.add(r);
                }
            }
            Collections.sort(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
            System.out.println();
        }
    }

    private static String sToNum(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='0'&&s.charAt(i)<='9')){
                sb.append(s.charAt(i));
            }else if(s.charAt(i)>='A'&&s.charAt(i)<='C'){
                sb.append("2");
            }else if(s.charAt(i)>='D'&&s.charAt(i)<='F'){
                sb.append("3");
            }else if(s.charAt(i)>='G'&&s.charAt(i)<='I'){
                sb.append("4");
            }else if(s.charAt(i)>='J'&&s.charAt(i)<='L'){
                sb.append("5");
            }else if(s.charAt(i)>='M'&&s.charAt(i)<='O'){
                sb.append("6");
            }else if(s.charAt(i)>='P'&&s.charAt(i)<='S'){
                sb.append("7");
            }else if(s.charAt(i)>='T'&&s.charAt(i)<='V'){
                sb.append("8");
            }else if(s.charAt(i)>='W'&&s.charAt(i)<='Z'){
                sb.append("9");
            }
        }
        return sb.toString();
    }
}
