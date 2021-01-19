import java.util.Arrays;

public class wechatRedbag {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int count=0;
        for(int i=0;i<n;i++){
            if(gifts[i]==gifts[n/2]){
                count++;
            }
        }
        if(count>n/2){
            return gifts[n/2];
        }else{
            return 0;
        }
    }
}

