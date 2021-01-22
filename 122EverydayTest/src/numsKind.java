import java.util.Scanner;

public class numsKind {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A1=0;
        int A2=0;
        int A3=0;
        double A4=0;
        int A5=0;
        int[] nums=new int[N];
        int falg=1;
        int count=0;
        for(int i=0;i<N;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(nums[i]%5==0){
                if(nums[i]%2==0){
                    A1+=nums[i];
                }
            }else if(nums[i]%5==1){
                A2+=falg*nums[i];
                falg=-falg;
            }else if(nums[i]%5==2){
                A3++;
            }else if(nums[i]%5==3){
                A4+=nums[i];
                count++;
            }else{
                A5=Math.max(nums[i],A5);
            }
        }
        A4=A4/count;
        if(A1==0){
            A1=N;
        }
        if(A2==0){
            A2=N;
        }
        if(A3==0){
            A3=N;
        }
        if(A4==0){
            A4=N;
        }
        if(A5==0){
            A5=N;
        }
        System.out.print(A1+" "+A2+" "+A3+" ");
        System.out.printf("%.1f",A4);
        System.out.println(" "+A5);
    }
}
