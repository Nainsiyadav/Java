public class DiagonalSum {
    public static void diagonalSum(int mat[][]){
        int sum = 0;
        // primary diagonalSum
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(i==j){
                    sum+= mat[i][j];
                }else if(i+j == mat.length-1){
                    sum+= mat[i][j];
                }
            }
        }
        System.out.println("sum is : "+sum);
    }
    
    // ----------optimized way --------
    
    public static void Dsum(int mat[][]){
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            //primary sum (i=j)
            sum+= mat[i][i];
            //secondry sum i+j=lenght-1 => j=lenght-1-i
            if(i != mat.length-1-i)
                sum+= mat[i][mat.length-1-i];
        }
        System.out.println("sum is : "+sum);
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       //diagonalSum(mat);
       Dsum(mat);
    }
}