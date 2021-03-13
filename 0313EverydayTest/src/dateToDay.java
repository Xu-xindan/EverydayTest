import java.util.Scanner;

public class dateToDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            int[] arr1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int count = 0;
            if ((year % 100 == 0 && year % 4 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                for (int i = 0; i < month - 1; i++) {
                    count += arr1[i];
                }
                count += day;
            } else {
                arr1[1] -= 1;
                for (int i = 0; i < month - 1; i++) {
                    count += arr1[i];
                }
                count += day;
            }
            System.out.println(count);
        }
    }
}
