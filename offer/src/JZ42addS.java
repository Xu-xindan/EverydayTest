/*
* 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
* 解法1；选定最后的 从前面往后试
* 解法2；前后同时动
* */
import java.util.ArrayList;
public class JZ42addS {
    public ArrayList<Integer> FindNumbersWithSum1(int [] array, int sum) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int lowIndex=0;
        int highIndex=array.length-1;
        while(arrayList.isEmpty()&&lowIndex<highIndex){
            if(array[lowIndex]+array[highIndex]==sum){
                arrayList.add(array[lowIndex]);
                arrayList.add(array[highIndex]);
            }else if(array[lowIndex]+array[highIndex]<sum){
                lowIndex++;
            }else{
                highIndex--;
                lowIndex=0;
            }
        }
        return arrayList;
    }

    public ArrayList<Integer> FindNumbersWithSum2(int [] array, int sum) {
        ArrayList<Integer> arrayList2=new ArrayList<>();
        int lowIndex=0;
        int highIndex=array.length-1;
        while(lowIndex<highIndex){
            int t=array[lowIndex]+array[highIndex];
            if(t==sum){
                arrayList2.add(array[lowIndex]);
                arrayList2.add(array[highIndex]);
                return arrayList2;
            }else if(t<sum){
                lowIndex++;
            }else{
                highIndex--;
            }
        }
        return arrayList2;
    }
}
