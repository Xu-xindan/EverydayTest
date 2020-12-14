/*
* 给定一个double的base和int的exponent 求base的exponent次方 base exponent不同时为0
* 注意次数可以小于0 结果单独保存
* */
public class JZ12mul {
    public double Power(double base, int exponent) {
        double res=1;
        if(exponent>0){
            for(int i=0;i<exponent;i++){
                res*=base;
            }
        }else if (exponent<0){
            for(int i=0;i>exponent;i--){
                res/=base;
            }
        }
        return res;
    }
}
