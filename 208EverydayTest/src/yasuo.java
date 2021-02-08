public class yasuo {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<chars.length){
            int count=1;
            char c=chars[i];
            sb.append(chars[i]);
            while(i<chars.length-1&&c==chars[i+1]){
                count++;
                i++;
            }
            if(count!=1){
                sb.append(count);
            }
            i++;
        }
        char[] chars1=sb.toString().toCharArray();
        for(int j=0;j<chars1.length;j++){
            chars[j]=chars1[j];
        }
        return sb.length();
    }
}
