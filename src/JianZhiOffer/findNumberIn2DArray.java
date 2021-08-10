package JianZhiOffer;

public class findNumberIn2DArray {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row=matrix.length;
        if(row==0){
            return false;
        }
        int column=matrix[0].length;
        if(column==0){
            return false;
        }
        int x=0,y=column-1;
        while(x<row && y>=0){
            if(matrix[x][y]>target){
                y--;
            }
            else if(matrix[x][y]<target){
                x++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
