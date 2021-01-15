public class ReK {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] numDouble=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            numDouble[i]=nums[i];
        }
        for(int i=nums.length;i<nums.length*2;i++){
            numDouble[i]=nums[i-nums.length];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=numDouble[nums.length-k+i];
        }
    }
}
