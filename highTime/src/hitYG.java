/*
* 黑默丁格有三个炮台,炮台能攻击到距离它R的敌人 (两点之间的距离为两点连续的距离,例如(3,0),(0,4)之间的距离是5),
* 如果一个炮台能攻击 到敌人,那么就会对敌人造成1×的伤害.黑默丁格将三个炮台放在N*M方格中的点上,并且给出敌人 的坐标.
* 问:那么敌人受到伤害会是多大?
* */
import java.util.Scanner;

public class hitYG {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int res = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int now=sc.nextInt();
                if (now <= res) {
                    res = res + now;
                } else {
                    res = res+maxyushu(res, now);
                }
            }
            System.out.println(res);
        }
    }

    private static int maxyushu(int res, int gw) {
        int m=1;
        for(int i=2;i<=Math.min(res,gw);i++){
            if(res%i==0&&gw%i==0){
                m=i;
            }
        }
        return m;
    }
}
