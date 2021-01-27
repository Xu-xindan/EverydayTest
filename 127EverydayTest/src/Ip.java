import java.util.Scanner;

public class Ip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String ip = sc.next();
            String str = sc.next();
            String[] strings = ip.split("\\.");
            long n = Long.parseLong(strings[0]);
            for (int i = 1; i < strings.length; i++) {
                n = n << 8;
                n =n+ Long.parseLong(strings[i]);
            }
            System.out.println(n);
            long tenIp=Long.parseLong(str);
            String s = Long.toBinaryString(tenIp);
            StringBuilder sb = new StringBuilder();
            int j1 = Integer.parseInt(s.substring(0, s.length() - 24), 2);
            sb.append(j1).append(".");
            int j2 = Integer.parseInt(s.substring(s.length() - 24, s.length() - 16), 2);
            sb.append(j2 + ".");
            int j3 = Integer.parseInt(s.substring(s.length() - 16, s.length() - 8), 2);
            sb.append(j3 + ".");
            int j4 = Integer.parseInt(s.substring(s.length() - 8, s.length()), 2);
            sb.append(j4);
            System.out.println(sb);
        }
    }
}
