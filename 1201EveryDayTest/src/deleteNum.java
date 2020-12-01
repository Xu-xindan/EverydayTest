import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class deleteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 1000;
            }
            System.out.println(delNum(n));
        }
    }

    public static int delNum(int n){
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(i);
        }
        while(queue.size()!=1){
            for(int i=0;i<2;i++){
                int t=queue.peek();
                queue.poll();
                queue.add(t);
            }
            queue.poll();
        }
        return queue.peek();
    }
}
