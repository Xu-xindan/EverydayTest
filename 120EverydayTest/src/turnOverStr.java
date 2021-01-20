public class turnOverStr {
    public String reverseOnlyLetters(String S) {
        char[] SArray=S.toCharArray();
        int i=0;
        int j=S.length()-1;
        while(i<j){
            while(!Character.isLetter(SArray[i])&&i<j){
                i++;
            }
            while(!Character.isLetter(SArray[j])&&i<j){
                j--;
            }
            char t=SArray[i];
            SArray[i]=SArray[j];
            SArray[j]=t;
            i++;
            j--;
        }
        String res="";
        for(int k=0;k<SArray.length;k++){
            res=res+SArray[k];
        }
        return res;
    }
}
