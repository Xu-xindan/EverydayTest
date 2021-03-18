import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class broWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String[] words=new String[n];
            for (int i = 0; i < n; i++) {
                words[i]=sc.next();
            }
            String findBro=sc.next();
            int r=sc.nextInt();
            sc.nextLine();
            dic(words,findBro,r);
        }
    }

    private static void dic(String[] words, String findBro,int r) {
        ArrayList<String> list=new ArrayList<>();
        Arrays.sort(words);
        for(String cur:words){
            if(isBro(cur,findBro)){
                list.add(cur);
            }
        }
        System.out.println(list.size());
        if(r<=list.size()&&list.size()>0){
            System.out.println(list.get(r-1));
        }
    }

    private static boolean isBro(String word, String findBro) {
        if(word.length()!=findBro.length()){
            return false;
        }
        if(findBro.equals(word)){
            return false;
        }
        char[] chars=findBro.toCharArray();
        Arrays.sort(chars);
        char[] wordChar=word.toCharArray();
        Arrays.sort(wordChar);
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]!=wordChar[i]){
                return false;
            }
        }
        return true;
    }
}
