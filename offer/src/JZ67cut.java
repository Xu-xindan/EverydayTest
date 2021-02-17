/*
* 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
* 每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？
* 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
* 解法：建数组  根据数学关系写
* */
public class JZ67cut {
    public int cutRope(int target) {
        if(target<4){
            return target-1;
        }
        int[] res=new int[target+1];
        res[2]=2;
        res[3]=3;
        for (int i = 4; i <=target ; i++) {
            res[i]=Math.max(res[i-2]*2,res[i-3]*3);
        }
        return res[target];
    }
}
