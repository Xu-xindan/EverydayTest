import java.util.Arrays;

public class macDes {
    public int findMaxGap(int[] A, int n) {
        int min= Math.min(A[0], A[n - 1]);
        Arrays.sort(A);
        return A[n-1]-min;
    }
}
