/*
* 实现一个函数用来找出字符流中第一个只出现一次的字符
* 思路：map存储字符和个数对应关系 arraylist存储字符 insert插入字符  插完后 遍历找到只出现一次的字符
* */
import java.util.ArrayList;
import java.util.HashMap;

public class JZ54notRepeat {
    HashMap<Character,Integer> charToNum=new HashMap<>();
    ArrayList<Character> chars=new ArrayList<>();
    public void Insert(char ch){
        if(charToNum.containsKey(ch)){
            charToNum.put(ch,charToNum.get(ch)+1);
        }else {
            charToNum.put(ch,1);
        }
        chars.add(ch);
    }
    public char FirstAppearingOnce(){
        for(char ch:chars){
            if(charToNum.get(ch)==1){
                return ch;
            }
        }
        return '#';
    }
}
