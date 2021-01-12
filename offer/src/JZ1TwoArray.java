/*
* 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
* 每一列都按照从上到下递增的顺序排序。输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*一行个数：array.length 一列个数：array[0].length  遍历 还有二分法可
* */
public class JZ1TwoArray {
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
