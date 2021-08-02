import java.util.Arrays;

public class JZ6 {
    public int minNumberInRotateArray1(int [] array) {
        Arrays.sort(array);
        return array[0];
    }

    public int minNumberInRotateArray(int [] array) {
        if(array.length==0) return 0;
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]){
                return array[i];
            }
        }
        return array[0];
    }
}
