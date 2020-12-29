/*
* 现在给定一个正整数N，算出N最少表示成多少个素数的和
* 思路：0，1不可分 素数 1个 任意偶数可以分为两个素数之和
* 奇数 奇数-2是素数的话 2个 否则 三个
* */
public class MinPrimeSum {
    public int MinPrimeSum (int N) {
        if(N==0||N==1){
            return 0;
        }
        if(isPrime(N)){
            return 1;
        }
        if(N%2==0){
            return 2;
        }else{
            if(isPrime(N-2)){
                return 2;
            }
            return 3;
        }
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
