import java.util.Scanner;

public class bag {
    static int[] wants;
    static int count=0;
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();
            wants=new int[n+1];
            wants[0]=0;
            for(int i=1;i<n+1;i++){
                wants[i]=sc.nextInt();
            }
        }
        findWay(n,40);
        System.out.println(count);
    }

    public static void findWay(int n,int target){
        if(target==0){
            count++;
            return;
        }
        if(((target>0)&&(n<0))||target<0){
            return;
        }
        findWay(n-1,target-wants[n]);
        findWay(n-1,target);
    }
}
