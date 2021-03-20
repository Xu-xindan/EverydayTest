import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class horse {
    static class People{
        int weight;
        int height;

        public People(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            People[] arr=new People[n];
            for (int i = 0; i <n ; i++) {
                int index=sc.nextInt();
                arr[index-1]=new People(sc.nextInt(),sc.nextInt());
            }
            Arrays.sort(arr, new Comparator<People>() {
                @Override
                public int compare(People p1, People p2) {
                   int result = Integer.compare(p1.height, p2.height);
                    if (result != 0)
                        return result;
                    else
                        return Integer.compare(p1.weight, p2.weight);
                }
            });
            int[] dp = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < dp.length; ++i) {
                dp[i] = 1;
                for (int j = i - 1; j >= 0; --j) {
                    if (arr[i].weight > arr[j].weight
                            || (arr[i].weight == arr[j].weight && arr[i].height == arr[j].height)) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.max(dp[i], max);
            }
            System.out.println(max);
        }
    }
}
