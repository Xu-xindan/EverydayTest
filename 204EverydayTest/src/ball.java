import java.util.Scanner;
public class ball {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int x0 = sc.nextInt();
            int y0 = sc.nextInt();
            int z0 = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int z1 = sc.nextInt();
            double r = Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1) + (z0 - z1) * (z0 - z1));
            double v=4.0/3*Math.acos(-1)*r*r*r;
            System.out.printf("%.3f",r);
            System.out.print(" ");
            System.out.printf("%.3f",v);
            System.out.println();
        }
    }
}
