/*
* 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
* 并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
* 解法：将每一个字母转换成小写 注意+32时需要强转成char
 * */
public class toLowerCase {
    public String toLowerCase(String str) {
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                res=res+(char)(str.charAt(i)+32);
            }else {
                res=res+str.charAt(i);
            }
        }
        return res;
    }
}