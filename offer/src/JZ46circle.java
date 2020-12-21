/*
* 小朋友们围成一个大圈 随机指定一个数m,让编号为0的小朋友开始报数 每次喊到m-1的小朋友出列 不再回到圈中
* 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友 求最后一个小朋友的编号
* 思路：递归
* */
public class JZ46circle {
    public int LastRemaining_Solution(int n, int m) {
        if(n==0){
            return -1;
        }else if(n==1){
            return 0;
        }else{
            return (LastRemaining_Solution(n-1,m)+m)%n;
        }
    }
}
