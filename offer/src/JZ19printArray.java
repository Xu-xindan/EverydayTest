import java.util.ArrayList;

public class JZ19printArray {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int startX=0;
        int startY=0;
        int endX=matrix[0].length-1;
        int endY=matrix.length-1;
        while(startX<=endX&&startY<=endY){
            if(startX<=endX){
                for (int i = startX; i <=endX; i++) {
                    arrayList.add(matrix[startY][i]);
                }
            }
            if(startY<endY){
                for (int i = startY+1; i <=endY; i++) {
                    arrayList.add(matrix[i][endX]);
                }
            }
            if(endY>startY&&startX<endX){
                for (int i = endX-1; i >=startX ; i--) {
                    arrayList.add(matrix[endY][i]);
                }
            }
            if(startX<endX&&startY<endY){
                for (int i = endY-1; i >=startY+1 ; i--) {
                    arrayList.add(matrix[i][startX]);
                }
            }
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return arrayList;
    }
}
