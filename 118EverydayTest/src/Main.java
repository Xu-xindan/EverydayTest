import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] values=new int[n];
            String[] keys=new String[n];
            int s=sc.nextInt();
            for(int i=0;i<n;i++){
                keys[i]=sc.next();
                values[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1-i;j++){
                    if(values[j]>values[j+1]){
                        int t=values[j];
                        values[j]=values[j+1];
                        values[j+1]=t;
                        String str=keys[j];
                        keys[j]=keys[j+1];
                        keys[j+1]=str;
                    }
                }
            }
            if(s==1){
                for(int i=0;i<n;i++){
                    System.out.println(keys[i]+" "+values[i]);
                }
            }else if(s==0){
                for(int i=n-1;i>=0;i--){
                    System.out.println(keys[i]+" "+values[i]);
                }
            }
        }
    }
}
