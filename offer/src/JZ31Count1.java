/*
* 求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
* 解法1：/10 求出每一位是否为1 ++
* 解法2：转成字符串 判断每位是否是‘1’ ++
* */
public class JZ31Count1 {
    public int NumberOf1Between1AndN_Solution1(int n) {
        int sum=0;
        for(int i=1;i<n+1;i++){
            int t=i;
            while(t>0){
                if(t%10==1){
                    sum++;
                }
                t=t/10;
            }
        }
        return sum;
    }

    public int NumberOf1Between1AndN_Solution2(int n){
        int count=0;
        for(int i=0;i<=n;i++){
            String str=String.valueOf(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    count++;
                }
            }
        }
        return count;
    }
}
