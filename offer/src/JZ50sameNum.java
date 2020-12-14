/*
* 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
* 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中第一个重复的数字。
* 解法1：set 遍历数组放入set中，重复的返回
* 解法2：让数组自己有序 比较当前数字是否与下一个数字相同 相同返回 但是返回的是最小的
 * */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JZ50sameNum {
    public boolean duplicate1(int numbers[],int length,int [] duplication) {
        Set<Integer> nums=new HashSet<>();
        for(int i=0;i<length;i++){
            if(!nums.contains(numbers[i])) {
                nums.add(numbers[i]);
            }else{
                duplication[0] =numbers[i];
                return true;
            }
        }
        return false;
    }

    //要求返回第一个相同的数字 此方法返回的是最小的
    public boolean duplicate2(int numbers[],int length,int [] duplication){
        if(length==0){
            return true;
        }
        Arrays.sort(numbers);
        for(int i=0;i<length-1;i++){
            if(numbers[i]==numbers[i+1]){
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}
