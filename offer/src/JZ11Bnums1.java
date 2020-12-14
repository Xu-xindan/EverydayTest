/*
* 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
* 解法1：java自带函数 Integer.bitCount
* 解法2：数转成二进制字符串，将字符串内所有0替换成空，长度即为个数
* 解法3：n&n-1
* 解法4：n&1 为1末位为1 >>>无符号右移直到0
* */
public class JZ11Bnums1 {
    public int NumberOf11(int n) {
        return Integer.bitCount(n);
    }

    public int NumberOf12(int n) {
        return Integer.toBinaryString(n).replaceAll("0","").length();
    }

    public int NumberOf13(int n) {
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }

    public int NumberOf14(int n) {
        int count=0;
        while(n!=0){
            count+=n&1;
            n=n>>>1;
        }
        return count;
    }
}
