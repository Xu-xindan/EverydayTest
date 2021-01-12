/*
他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn. 如果遇到的怪物防御力bi小于等于小易的当前能力值c,
那么他就能轻松打败怪物,并 且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.
那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
* */
import java.util.Scanner;

public class fire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int R = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int res = 0;
            int s1 = (x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0);
            int s2 = (x2 - x0) * (x2 - x0) + (y2 - y0) * (y2 - y0);
            int s3 = (x3 - x0) * (x3 - x0) + (y3 - y0) * (y3 - y0);
            if (Math.sqrt(s1) == R) {
                res++;
            }
            if (Math.sqrt(s2) == R) {
                res++;
            }
            if (Math.sqrt(s3) == R) {
                res++;
            }
            System.out.println(res + "x");
        }
    }
}
