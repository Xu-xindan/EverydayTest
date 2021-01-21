public class midNum {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count1=0;
            int count2=0;
            for(int j=0;j<i;j++){
                count1+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                count2+=nums[j];
            }
            if(count1==count2){
                return i;
            }
        }
        return -1;
    }
}
