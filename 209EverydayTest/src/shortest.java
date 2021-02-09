import java.util.Arrays;

public class shortest {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int[] num=nums.clone();
        Arrays.sort(num);
        while(num[j]==nums[j]&&i<j){
            j--;
        }
        while(nums[i]==num[i]&&i<j){
            i++;
        }
        if(i!=j) {
            return j - i + 1;
        }
        return 0;
    }
}
