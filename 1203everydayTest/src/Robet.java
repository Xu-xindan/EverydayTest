import java.util.Scanner;

public class Robet {
    public static int countWays(int x, int y) {
        if(x==1){
            return 1;
        }else if(y==1){
            return 1;
        }
        return countWays(x-1,y)+countWays(x,y-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(countWays(a,b));
    }
}
