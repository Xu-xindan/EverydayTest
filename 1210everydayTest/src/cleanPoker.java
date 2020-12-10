import java.util.Scanner;

public class cleanPoker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==0||N>100){
            return;
        }
        for(int i=0;i<N;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[2*n];
            for (int j=0;j<2*n;j++){
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<k;j++){
                arr=exchange(arr);
            }
            for(int j=0;j<2*n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }

    public static int[] exchange(int[] array){
        int[] res=new int[array.length];
        for(int i=0;i<array.length;i++){
            if(i%2==0){
                res[i]=array[i/2];
            }else{
                res[i]=array[i/2+array.length/2];
            }
        }
        return res;
    }
}
