import java.util.Scanner;

public class TWODArrays {
    /*public static boolean Search(int Mat[][],int key){
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j < Mat.length; j++) {
                if(Mat[i][j] == key){
                    System.out.print("Found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Not Found");
        return false;
    }
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int Mat[][] = new int[3][3];
    int n = 3;
    int  m = 3;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print("enter "+i+" , "+j+" element : ");
            Mat[i][j] = sc.nextInt();
        }
        System.out.println();
        
    }
    
    System.out.println("Your matrix is : ");
    for (int i = 0; i < Mat.length; i++) {
        for (int j = 0; j < Mat.length; j++) {
            System.out.print(Mat[i][j]+" ");
        }
        System.out.println();
    }
     System.out.print("Eter your key :");
     int key = sc.nextInt();
    Search(Mat ,key);
  }*/

    // ----------FIND MAX AND MIN VALUE OF MATRIX ---------
 public static void Max(int mat[][]){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat.length; j++) {
            if(max < mat[i][j]){
                max  = mat[i][j];
            }if(min > mat[i][j]){
                min = mat[i][j];
            }
        }
    }
    System.out.println("your max number is : "+max);
    System.out.println("your min number is : "+min);
 }
 public static void Print(int mat[][]){
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat.length; j++) {
            System.out.print( mat[i][j] +" ");

        }
        System.out.println();
    }
 }
 public static void main(String[] args) {
    int mat[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat.length; j++) {
            System.out.print("enter your ("+i+","+j+" element : ");
            mat[i][j] = sc.nextInt();
        }
        System.out.println();
    }
    Max(mat);
    //Print(mat);
 }
}
