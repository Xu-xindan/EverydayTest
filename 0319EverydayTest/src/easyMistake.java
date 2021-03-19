import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class easyMistake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<>();
        while(sc.hasNext()){
            String s=sc.next();
            int line=sc.nextInt();
            String[] arr=s.split("\\\\");
            s=arr[arr.length-1];
            if(s.length()>16){
                s=s.substring(s.length()-16);
            }
            s=s+" "+line;
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        int count=0;
        for(String s:map.keySet()){
            count++;
            if(count>map.size()-8){
                System.out.println(s+" "+map.get(s));
            }
        }
    }
}
