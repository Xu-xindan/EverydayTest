import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
/*
* 输入两个整数 n 和 m，从数列1，2，3.......n 中随意取几个数,使其和等于 m ,要求将其中所有的可能组合列出来
* */
public class sumM {
    public static List sum(int n, int m){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++){
            map.put(i, i);
        }
        for (int i = 1; i < m / 2 + 1; i++){
            if (map.containsKey(m - i)){
                result.add(i);
                result.add(m - i);
            }
        }
        if (n == m){
            result.add(m);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String ta = null;
        if (in.hasNext()){
            ta = in.nextLine();
        }
        List<Integer> result = sum(Integer.parseInt(line), Integer.parseInt(ta));
        int sum = result.size();
        for (int i = 0; i < sum;){
            //奇数个结果
            if (i == sum - 1 && sum % 2 != 0){
                System.out.println(result.get(i));
                i ++;
            }else {
                System.out.println(result.get(i) + " "+ result.get(i + 1));
                i += 2;
            }
        }
    }
}