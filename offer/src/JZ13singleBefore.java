/*
* 实现一个函数来调整该数组中数字的顺序，使得奇数位于前半部分，偶数位于后半部分
* 并保证奇数和奇数，偶数和偶数之间的相对位置不变
* 思路1：一个下标遍历 找到奇数停下 另一个下标停在偶数位置 从偶数下标到奇数下标前一个全往后挪 把奇数放进挪出的位置
* 思路2：新建一个数组 算出奇数的个数 新数组中奇数从0开始 偶数从count开始遍历放回新数组 最后把所有新数组元素放回旧数组
* */
public class JZ13singleBefore {
    public void reOrderArray1(int [] array) {
        int low=0;
        int high=0;
        while (low<array.length){
            if(array[low]%2!=0){
                int temp=array[low];
                for(int i=low;i>high;i--){
                    array[i]=array[i-1];
                }
                array[high]=temp;
                high++;
                low++;
            }else{
                low++;
            }
        }
    }

    public void reOrderArray2(int [] array){
        int[] newArray=new int[array.length];
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                count++;
            }
        }
        int low=0;int high=count;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                newArray[high++]=array[i];
            }else {
                newArray[low++]=array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            array[i]=newArray[i];
        }
    }
}
