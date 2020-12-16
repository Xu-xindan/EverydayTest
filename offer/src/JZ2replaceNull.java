/*
* 将一个字符串中的每个空格替换成“%20”
* 解法：定义一个新的字符串 遍历遇到空格就添加“%20” 否则就加本身
* */
public class JZ2replaceNull {
    public String replaceSpace(StringBuffer str) {
        StringBuilder res= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("%20");
            }else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
