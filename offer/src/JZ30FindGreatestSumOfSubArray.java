/*
* 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。
* 求所有子数组的和的最大值。要求时间复杂度为 O(n).
* 加上当前的数后还没原来的和大，踢掉前面的和，另外需要一个sumMax记录和的最大值
* */

public class JZ30FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int highIndex=1;
        int sum=array[0];
        int sumMax=sum;
        while(highIndex<array.length){
            sum=sum+array[highIndex];
            if(array[highIndex]>sum){
                sum=array[highIndex];
            }
            if(sum>sumMax){
                sumMax=sum;
            }
            highIndex++;
        }
        return sumMax;
    }
}
