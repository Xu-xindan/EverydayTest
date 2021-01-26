import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(sc.next(), 0);
            }
            int v = sc.nextInt();
            int count = 0;
            for (int i = 0; i < v; i++) {
                String str = sc.next();
                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + 1);
                } else {
                    count++;
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Invalid : " + count);
        }
    }
}
