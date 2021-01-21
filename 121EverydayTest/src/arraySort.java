public class arraySort {
    public int[] sortArrayByParity(int[] A) {
        int i=0;
        int j=A.length-1;
        while(i<j){
            while(i<j&&A[i]%2==0){
                i++;
            }
            while(i<j&&A[j]%2!=0){
                j--;
            }
            int t=A[i];
            A[i]=A[j];
            A[j]=t;
            i++;
            j--;
        }
        return A;
    }
}
