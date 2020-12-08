/*
功能：验证尼科彻斯定理，任何一个数的立方都可以写成m个奇数之和
输入：整数m（1<m<100)
输出：组成它的m个连续奇数（返回值为String)
例如：输入：5
      输出： 21+23+25+27+29
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            if(m>100||m<1){
                throw new IllegalArgumentException("参数错误");
            }
            Main main = new Main();
            System.out.println(main.GetSequeOddNum(m));
        }
    }

    public String GetSequeOddNum(int m) {
        int add1 = m*m;
        if(m%2==0){
            add1 = (add1-1)-2*(m/2-1);
        }
        if(m%2!=0){
            add1 = add1-(m/2)*2;
        }
        String str = new String();
        for (int i = 0; i < m; i++) {
            if(i==0){
                str = String.valueOf(add1);
            }else {
                str = str + "+" + add1;
            }
            add1=add1+2;
        }
        return str;
    }
}
