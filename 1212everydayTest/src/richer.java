public class richer {
    public static void main(String[] args) {
        System.out.print(30*10+" ");
        int sum=0;
        int mul=1;
        for(int i=0;i<30;i++){
            sum=sum+mul;
            mul*=2;
        }
        System.out.print(sum);
    }
}
