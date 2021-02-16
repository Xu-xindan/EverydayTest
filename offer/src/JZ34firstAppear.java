/*
* 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
* 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
* 解法：将字符串放入map中，遍历找出第一个值为1的并且返回序号
* */
import java.util.LinkedHashMap;
import java.util.Map;
public class JZ34firstAppear {
    public int FirstNotRepeatingChar(String str) {
        char[] chars=str.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),0);
            }
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
        }
        for (Character character:map.keySet()
             ) {
            if(map.get(character)==1){
                for(int i=0;i<str.length();i++){
                    if (chars[i]==character){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
