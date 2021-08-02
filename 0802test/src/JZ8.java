public class JZ8 {
    public int jumpFloor1(int target) {
        if(target==1||target==2){
            return target;
        }
        return jumpFloor1(target-1)+jumpFloor1(target-2);
    }
    public int jumpFloor(int target) {
        if(target==1||target==2){
            return target;
        }
        int[] jump=new int[target+1];
        jump[0]=1;
        jump[1]=1;
        for (int i = 2; i < target + 1; i++) {
            jump[i]=jump[i-1]+jump[i-2];
        }
        return jump[target];
    }
}
