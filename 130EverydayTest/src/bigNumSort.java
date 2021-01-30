import java.util.Scanner;

public class bigNumSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String[] strings=new String[n];
            for(int i=0;i<n;i++){
                strings[i]=sc.next();
            }
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(strings[i].length()>strings[j].length()){
                        String t=strings[i];
                        strings[i]=strings[j];
                        strings[j]=t;
                    }else if(strings[i].length()==strings[j].length()){
                        if(strings[i].compareTo(strings[j])>0){
                            String t=strings[i];
                            strings[i]=strings[j];
                            strings[j]=t;
                        }
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.println(strings[i]);
            }
        }
    }
}
