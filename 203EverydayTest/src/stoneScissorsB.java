import java.util.Scanner;

public class stoneScissorsB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count1=0;
        int count2=0;
        int[] as=new int[3];
        int[] bs=new int[3];
        for(int i=0;i<n;i++){
            String a=sc.next();
            String b=sc.next();
            if(a.equals("C")){
                if(b.equals("J")){
                    count1++;
                    as[0]++;
                }else if(b.equals("C")){
                    count2++;
                }else{
                    bs[2]++;
                }
            }else if(a.equals("J")){
                if(b.equals("B")){
                    count1++;
                    as[1]++;
                }else if(b.equals("J")){
                    count2++;
                }else{
                    bs[0]++;
                }
            }else{
                if(b.equals("C")){
                    count1++;
                    as[2]++;
                }else if(b.equals("B")){
                    count2++;
                }else {
                    bs[1]++;
                }
            }
        }
        int count3=n-count1-count2;
        System.out.println(count1+" "+count2+" "+count3);
        System.out.println(count3+" "+count2+" "+count1);
        if(as[2]>=as[1]&&as[2]>=as[0]){
            System.out.print("B"+" ");
        }else if(as[0]>=as[1]&&as[0]>=as[1]){
            System.out.print("C"+" ");
        }else{
            System.out.print("J"+" ");
        }
        if(bs[2]>=bs[1]&&bs[2]>=bs[0]){
            System.out.println("B");
        }else if(bs[0]>=bs[1]&&bs[0]>=bs[1]){
            System.out.println("C");
        }else{
            System.out.println("J");
        }
    }
}
