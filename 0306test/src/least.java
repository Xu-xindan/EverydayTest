import java.util.ArrayList;
import java.util.Arrays;

public class least {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> res=new ArrayList<>();
        if(k>input.length){
            return res;
        }
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(a,4));
    }
}
