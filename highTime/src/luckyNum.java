/*
* 现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。 f(x)表示把x这个数用十进制写出后各个数位上的数字之和。
* g(x)表示把x这个数用二进制写出后各个数位上的数字之和。对于一些正整数x满足f(x)=g(x)称为幸运数
* 现在他想知道，大于0且小于等于n的幸运数有多少个？
* */
import java.util.Scanner;

public class luckyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int res=0;
            for(int i=1;i<=n;i++){
                if(f(i)==g(i)){
                    res++;
                }
            }
            System.out.println(res);
        }
    }

    private static int g(int i) {
        int res=i&1;
        while(i>1){
            i=i>>1;
            res+=i&1;
        }
        return res;
    }

    private static int f(int i) {
        int res=i%10;
        while(i>9){
            i=i/10;
            res+=i%10;
        }
        return res;
    }
}
