import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JZ28halfNum {
    /*
    * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
    * 方法1：对数组排序，中间那个数一定是
    * 方法2：如果有符合条件的数字，则它出现的次数比其他所有数字出现的次数和还要多
    * 方法3：map
    * */
    public int MoreThanHalfNum_Solution1(int [] array) {
        if(array.length==0){
            return 0;
        }
        Arrays.sort(array);
        int middle=array[array.length/2];
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==middle){
                count++;
            }
        }
        if(count>array.length/2){
            return middle;
        }
        return 0;
    }
    public int MoreThanHalfNum_Solution2(int [] array){
        if(array.length==0){
            return 0;
        }
        int res=array[0];
        int count=1;
        for(int i=1;i<array.length;i++){
            if(array[i]==res){
                count++;
            }else{
                count--;
            }
            if(count==0){
                res=array[i];
                count=1;
            }
        }
        int cou=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==res){
                cou++;
            }
        }
        if(cou>array.length/2){
            return res;
        }
        return 0;
    }
    public int MoreThanHalfNum_Solution(int [] array){
        Map<Integer,Integer> numToTime=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!numToTime.containsKey(array[i])){
                numToTime.put(array[i],1);
            }else{
                int count=numToTime.get(array[i]);
                numToTime.put(array[i],count+1);
            }
        }
        for(int i=0;i<array.length;i++){
            if(numToTime.get(array[i])>array.length/2){
                return array[i];
            }
        }
        return 0;
    }
}

