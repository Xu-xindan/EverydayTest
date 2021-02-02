import java.util.Scanner;

public class countTwo {
    public static int countNumberOf2s(int n) {
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0||cur==1) res += high * digit;
            else if(cur == 2) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(countNumberOf2s(sc.nextInt()));
        }
    }
}
