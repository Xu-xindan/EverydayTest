public class seat {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        if(nums.length==0){
            res[0]=res[1]=-1;
            return res;
        }
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == target) {
                res[0] = i;
                break;
            }
            if(nums[i]>target||i==nums.length-1){
                res[0]=res[1]=-1;
                return res;
            }
        }
        for(int i=res[0];i<nums.length;i++) {
            if (nums[i] > target) {
                res[1] = i - 1;
                break;
            }
            if(i==nums.length-1) {
                res[1] = nums.length - 1;
            }
        }
        return res;
    }
}
