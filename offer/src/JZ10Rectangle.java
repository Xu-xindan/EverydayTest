/*
* 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
* 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法
* 当前个数是前两个个数之和
* */
import java.util.Scanner;

public class JZ10Rectangle {
    public static int RectCover(int target) {
        if(target<1){
            return 0;
        }
        if(target==1||target==2){
            return target;
        }else{
            return RectCover(target-1)+RectCover(target-2);
        }
    }
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(RectCover(n));
    }*/
}