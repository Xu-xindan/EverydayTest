public class JZ11 {
    public static int NumberOf1(int n) {
        int res=0;
        if(n>=0) {
            while (n / 2 != 0) {
                if (n % 2 == 1) {
                    res++;
                }
                n = n / 2;
            }
            if (n == 1) res++;
        }else{
            int n1=0-n;
            res=32-NumberOf1(n1);
            if(n1%2==1){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-10));
    }
}
