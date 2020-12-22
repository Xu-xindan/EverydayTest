/*
* 输入n个整数，找出其中最小的K个数
* 思路1：排序 前k个放入顺序表中
* 另快排 堆排 归并皆可
* */
import java.util.ArrayList;
import java.util.Arrays;
public class JZ29minK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(k>input.length){
            return arrayList;
        }
        for(int i=0;i<k;i++){
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}
