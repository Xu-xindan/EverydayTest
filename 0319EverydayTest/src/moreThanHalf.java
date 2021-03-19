import java.util.Arrays;

public class moreThanHalf {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int res=array[array.length/2];
        int count=0;
        for (int i = 0; i <array.length; i++) {
            if(array[i]==res){
                count++;
            }
        }
        if(count>array.length/2){
            return res;
        }
        return 0;
    }
}
