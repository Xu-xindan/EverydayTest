import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String lStr=sc.nextLine();
        String sStr=sc.nextLine();
        int count=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<lStr.length();i++){
            map.put(lStr.charAt(i),map.getOrDefault(lStr.charAt(i),0)+1);
        }
        for(int i=0;i<sStr.length();i++){
            if(map.containsKey(sStr.charAt(i))){
                int num=map.get(sStr.charAt(i));
                if(num<=0){
                    count++;
                }
                map.put(sStr.charAt(i),num-1);
            }else{
                count++;
            }
        }
        if(count==0){
            System.out.println("Yes"+" "+(lStr.length()-sStr.length()));
        }else{
            System.out.println("No"+" "+count);
        }
    }
}
