import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] credits=new int[n];
        int[] grades=new int[n];
        double[] GPAs=new double[n];
        int cre=0;
        double GPA=0;
        for(int i=0;i<n;i++){
            credits[i]=sc.nextInt();
            cre+=credits[i];
        }
        for(int i=0;i<n;i++){
            grades[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(grades[i]>=90){
                GPAs[i]=4.0*credits[i];
            }else if(grades[i]>=85){
                GPAs[i]=3.7*credits[i];
            }else if(grades[i]>=82){
                GPAs[i]=3.3*credits[i];
            }else if(grades[i]>=78){
                GPAs[i]=3.0*credits[i];
            }else if(grades[i]>=75){
                GPAs[i]=2.7*credits[i];
            }else if(grades[i]>=72){
                GPAs[i]=2.3*credits[i];
            }else if (grades[i]>=68){
                GPAs[i]=2.0*credits[i];
            }else if (grades[i]>=64){
                GPAs[i]=1.5*credits[i];
            } else if (grades[i]>=60){
                GPAs[i]=1.0*credits[i];
            }else{
                GPAs[i]=0;
            }
            GPA+=GPAs[i];
        }
        System.out.printf("%.2f",GPA/cre);
    }
}
