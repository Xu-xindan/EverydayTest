/*
* 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
* 解法：简单粗暴 一个数既不等于前一个数也不等于后一个数 单独考虑一头一尾
* */
import java.util.Arrays;

public class JZ40findTwonum {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        if(array[0]!=array[1]) {
            num1[0]=array[0];
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] !=array[i-1]&&array[i]!=array[i+1]){
                    num2[0]=array[i];
                    break;
                }
            }
            num2[0]=array[array.length-1];
        }else {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] != array[i - 1] && array[i] != array[i + 1]) {
                    if (num1[0] == 0) {
                        num1[0] = array[i];
                    } else {
                        num2[0] = array[i];
                    }
                }
            }
            if(num2[0]==0){
                num2[0]=array[array.length-1];
            }
        }
    }
}
