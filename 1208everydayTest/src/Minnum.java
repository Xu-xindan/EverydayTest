import java.util.*;

public class Minnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        int[] nums=new int[10];
        for(int i=0;i<10;i++){
            nums[i]=sc.nextInt();
        }
        if(nums[0]!=0) {
            for (int i = 1; i < 10; i++) {
                if (nums[i] != 0) {
                    queue.add(i);
                    nums[i]--;
                    break;
                }
            }
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<nums[i];j++){
                queue.add(i);
            }
        }
        for(int t:queue){
            System.out.print(t);
        }
    }
}
