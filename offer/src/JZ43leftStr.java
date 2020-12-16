/*
* 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出
* 思路：把字符串分成两半 转换顺序合成新的字符串返回即可
* */
public class JZ43leftStr {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0||n==0){
            return str;
        }
        String str1=str.substring(n);
        String str2=str.substring(0,n);
        String res=str1+str2;
        return res;
    }
}
