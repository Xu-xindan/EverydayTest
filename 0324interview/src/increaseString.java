public class increaseString {
    public static String maxString(String s){
        int max=0;
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            for(int j=i;j<s.length()-1;j++){
                if(s.charAt(j)<s.charAt(j+1)){
                    count++;
                    if(max<count){
                        max=count;
                        index=i;
                    }
                }else{
                    break;
                }
            }
        }
        return s.substring(index,index+max);
    }

    public static void main(String[] args) {
        String s="123123232323232323245689";
        System.out.println(maxString(s));
    }
}
