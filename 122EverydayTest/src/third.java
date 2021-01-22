import java.util.Arrays;

public class third {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int n : nums) {
            if (n > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (firstMax == n){
                continue;
            }else  if (n > secondMax) {
                thirdMax = secondMax;
                secondMax = n;
            } else if (n == secondMax) {
                continue;
            } else if (n > thirdMax) {
                thirdMax = n;
            }
        }
        return thirdMax == Long.MIN_VALUE ? (int)firstMax : (int)thirdMax;
    }
}
