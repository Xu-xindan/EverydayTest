/*
* 输入五张牌 0可以被当作任意数字 看是否可以凑成顺子
* 思路:凑成数字三个条件 1：数组长度必须是5 2.最大数最小数差不能超过5 3.除了0之外其他数字不能重复
* 解法1：遍历直接写 满足以上三个条件即可
* 解法2：遍历一遍 除了0外放入set 有重复的直接false 同时找到最大值最小值求差
* */
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class JZ45Poker {
    public boolean isContinuous1(int [] numbers) {
        if(numbers.length!=5){
            return false;
        }
        Arrays.sort(numbers);
        int min=0;
        int max=numbers[4];
        for(int i=0;i<5;i++){
            if(numbers[i]!=0){
                min=numbers[i];
                break;
            }
        }
        if(max-min>=5){
            return false;
        }
        for(int i=0;i<4;i++){
            if(numbers[i]!=0&&numbers[i]==numbers[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean isContinuous2(int [] numbers){
        if(numbers.length!=5){
            return false;
        }
        Set<Integer> set=new TreeSet<>();
        int min=14;
        int max=0;
        for(int i=0;i<5;i++){
            if(numbers[i]!=0) {
                if (set.contains(numbers[i])) {
                    return false;
                } else {
                    set.add(numbers[i]);
                }
                min = Math.min(min, numbers[i]);
                max = Math.max(max, numbers[i]);
            }
        }
        if(max-min>5){
            return false;
        }
        return true;
    }
}
