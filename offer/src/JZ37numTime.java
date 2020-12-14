/*
* 统计一个数字在升序数组中出现的次数
* 解法1：遍历(可以直接遍历完代码简短感觉复杂度会高) 找到第一个相同元素往后找 注意：最后一个元素也是得单独考虑
* 解法2:二分查找 找到第一个是k的下标以及第一个是k+1的下标 相减 注意k+1不存在(在二分查找里end+1) k不存在的话 查找到的下标也是k+1的第一个下标
* */
public class JZ37numTime {
    public int GetNumberOfK1(int [] array , int k) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                while(array[i]==k&&i<array.length-1){//会遗漏最后一个元素
                    count++;
                    i++;
                }
                if(array[array.length-1]==k){
                    count++;
                }
                break;
            }
        }
        return count;
    }

    public int GetNumberOfK2(int [] array , int k){
        int K=binarySearch(array,k);
        int K_1=binarySearch(array,k+1);
        return K_1-K;
    }

    public static int binarySearch(int[] array,int k){
        int begin=0;
        int end=array.length;
        while(begin<end){
            int mid=(begin+end)/2;
            if(array[mid]>=k){//找第一个下标
                end=mid;
            }else{
                begin=mid+1;
            }
        }
        return begin;
    }
}
