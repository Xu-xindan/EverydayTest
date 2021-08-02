public class JZ1 {
    public boolean Find(int target, int [][] array) {
        if(array.length<=0||array[0].length<=0){
            return false;
        }
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(target==array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Find1(int target, int [][] array) {
        if(array.length<=0||array[0].length<=0){
            return false;
        }
        int r=0;int c=array[0].length-1;
        while(r<array.length&&c>=0&&r>=0&&c<array[0].length){
            if(target==array[r][c]){
                return true;
            }else if(target>array[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
