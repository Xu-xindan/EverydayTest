public class JZ7 {
    public int Fibonacci1(int n) {
            if(n==0||n==1){
                return n;
            }
            return Fibonacci1(n-1)+Fibonacci1(n-2);
    }
    public int Fibonacci(int n) {//时间复杂度较快
        if(n==0||n==1){
            return n;
        }
        int[] fib=new int[n+1];
        fib[0]=0;fib[1]=1;
        for (int i = 2; i < n+1; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
}
