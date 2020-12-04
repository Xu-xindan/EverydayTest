public class mulArray {
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        for(int i=0;i<A.length;i++){
            B[i]=1;
            for(int j=0;j<i;j++){
                B[i]*=A[j];
            }
            for(int h=i+1;h<A.length;h++){
                B[i]*=A[h];
            }
        }
        return B;
    }
}
