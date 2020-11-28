import java.util.Scanner;

public class nCounthalf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strings=str.split(" ");
        int[] arr=new int[strings.length];
        for(int i=0;i<strings.length;i++){
            arr[i]=Integer.parseInt(strings[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                System.out.println(arr[i]);
                break;
            }
        }

    }
}

