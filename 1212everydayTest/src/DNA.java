import java.util.Scanner;

public class DNA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        int maxIndex=0;
        int max = 0;
        for(int i=0;i<str.length()-n;i++){
            int count = 0;
            for(int j=i;j<n+i;j++) {
                if (str.charAt(j) == 'C' || str.charAt(j) == 'G') {
                    count++;
                }
            }
            if (count > max) {
                maxIndex = i;
                max = count;
            }
        }
        System.out.println(str.substring(maxIndex,maxIndex+n));
    }
}
