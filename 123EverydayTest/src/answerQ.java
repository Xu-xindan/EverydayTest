import java.util.Scanner;

public class answerQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[] scores=new int[N];
            for(int i=0;i<N;i++){
                scores[i]=sc.nextInt();
            }
            for(int i=0;i<M;i++){
                String c=sc.next();
                int a=sc.nextInt();
                int b=sc.nextInt();
                int max=0;
                if(c.equals("Q")){
                    int begin=Math.min(a,b)-1;
                    int end=Math.max(a,b);
                    for(int j=begin;j<end;j++){
                        max=Math.max(max,scores[j]);
                    }
                    System.out.println(max);
                }
                if(c.equals("U")){
                    scores[a-1]=b;
                }
            }
        }
    }
}
