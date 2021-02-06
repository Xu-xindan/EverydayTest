public class baiwa {
    public static void main(String[] args) {
        System.out.print(300);
        long count=0;
        for (int i = 0; i < 30; i++) {
            count+=Math.pow(2,i);
        }
        System.out.println(" "+count);
    }
}
