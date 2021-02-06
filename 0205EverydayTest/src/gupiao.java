import java.util.Arrays;

public class gupiao {
    public static int calculateMax(int[] prices) {
        int n=prices.length;
        int[] arr=new int[n-1];
        int k=0;
        for (int i = 0; i <prices.length-1 ; i++) {
            int max=0;
            for (int j = i+1; j <prices.length ; j++) {
                max=Math.max(max,prices[j]-prices[i]);
            }
            arr[k++]=max;
        }
        Arrays.sort(arr);
        return arr[arr.length-1]+arr[arr.length-2];
    }

    public static void main(String[] args) {
        int[] p={3,8,5,1,7,8};
        System.out.println(calculateMax(p));
    }
}
