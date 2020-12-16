/*
* 找出所有和为S的连续正数序列
* 思路：双指针法：一开始low放在1 high放在2 和小了high就往后走 和大了low就往后走 相等就加入表中
* */
import java.util.ArrayList;

public class JZ41addSomeS {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        int low=1;
        int high=2;
        while(low<high){
            int S=(low+high)*(high-low+1)/2;
            if(S==sum){
                ArrayList<Integer> arrayList=new ArrayList<>();
                for(int i=low;i<high+1;i++){
                    arrayList.add(i);
                }
                arrayLists.add(arrayList);
                low++;
            }else if(S<sum){
                high++;
            }else{
                low++;
            }
        }
        return arrayLists;
    }
}
