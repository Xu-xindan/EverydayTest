import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] ps=sc.next().split("\\.");
        String[] as=sc.next().split("\\.");
        int PG=Integer.parseInt(ps[0]);
        int PS=Integer.parseInt(ps[1]);
        int PK=Integer.parseInt(ps[2]);
        int AG=Integer.parseInt(as[0]);
        int AS=Integer.parseInt(as[1]);
        int AK=Integer.parseInt(as[2]);
        long P=PG*17*29+PS*29+PK;
        long A=AG*17*29+AS*29+AK;
        long res=A-P;
        String r="";
        if(res<0){
            System.out.print("-");;
            res=-res;
        }
        int g= (int) (res/(17*29));
        int s= (int) ((res%(17*29))/29);
        int k= (int) (res%29);
        r=r+g+"."+s+"."+k;
        System.out.println(r);
    }
}
