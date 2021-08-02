import java.util.Arrays;
import java.util.HashMap;

public class JZ28 {
    public int MoreThanHalfNum_Solution1(int [] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i],hashMap.get(array[i])+1);
                if(hashMap.get(array[i])==array.length/2+1){//先加再判定的 得＋1
                    return array[i];
                }
            }else{
                hashMap.put(array[i],1);
            }
        }
        return 0;
    }
}
