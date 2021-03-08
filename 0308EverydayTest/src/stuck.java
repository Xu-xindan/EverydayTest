import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stuck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int choose=sc.nextInt();
            int length=sc.nextInt();
            if(choose==1){
                list.add(length);
            }else{
                list.remove(Integer.valueOf(length));
            }
            System.out.println(isMap(list));
        }
    }

    private static String isMap(List<Integer> list) {
        if(list.size()<=2){
            return "No";
        }
        int sum=0;
        int max=0;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
            sum+=list.get(i);
        }
        return sum-max>max?"Yes":"No";
    }
}
