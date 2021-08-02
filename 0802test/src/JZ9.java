public class JZ9 {
    public int jumpFloorII(int target) {
        int[] jump=new int[target];
        jump[0]=1;
        for(int i=1;i<target;i++){
            jump[i]=jump[i-1]*2;
        }
        return jump[target-1];
    }
}
