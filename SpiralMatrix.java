public class SpiralMatrix {
    public static void printSpiral(int mat[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.length-1;
        int endCol = mat.length-1;
        while (startRow <= endRow && startCol <= endCol) {
            // -------top-----
            for(int j=startCol; j<=endCol; j++){
                System.out.print(mat[startRow][j]+" ");
            }
            
            //-------right-------
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(mat[i][endCol]+" ");
            }

            //-------bottom------
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(mat[endRow][j]+" ");
            }
            //-------left------
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(mat[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printSpiral(mat);
    }
}
