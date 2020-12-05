public class changeAB {
    public int[] exchangeAB(int[] AB) {
        int[] BA=new int[2];
        BA[0]=AB[1];
        BA[1]=AB[0];
        return BA;
    }
}
