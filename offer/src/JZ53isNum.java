/*
*请实现一个函数用来判断字符串是否表示数值（包括整数和小数）
* 思路：无限穷举 考虑e .  +/-
* */
public class JZ53isNum {
    public boolean isNumeric(char[] str) {
        if(str.length==0){
            return false;
        }
        if(str.length==1){
            if(str[0]<'0'||str[0]>'9'){
                return false;
            }else{
                return true;
            }
        }
        boolean sign=false;
        boolean decimal=false;
        boolean hasE=false;
        for(int i=0;i<str.length;i++){
            if(str[i]=='e'||str[i]=='E'){
                if(i==str.length-1){
                    return false;
                }
                if(hasE){
                    return false;
                }
                hasE=true;
            }else if(str[i]=='+'||str[i]=='-'){
                if(sign&&str[i-1]!='e'&&str[i-1]!='E'){
                    return false;
                }
                if (!sign && i > 0 && str[i-1] != 'e' && str[i-1] != 'E') {
                    return false;
                }
                sign = true;
            }else if(str[i]=='.'){
                if(hasE||decimal){
                    return false;
                }
                decimal=true;
            }else if(str[i]>'9'||str[i]<'0'){
                return false;
            }
        }
        return true;
    }
}
