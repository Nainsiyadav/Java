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
  }

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
 }*/

//================= QUESTIONS ==============
/*Question 1 : Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2
public static void FindNumber(int mat[][],int key){
    int index = 0;
    int count = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if(mat[i][j] == key){
            index = mat[i][j];
            count++;
        }
      }  
    }
    System.out.println("found key "+count+" times ");
}*/
public static void main(String[] args) {
    //int[][] mat = {{4,7,8},{8,8,7}};
    //FindNumber(mat,7);
    int mat[][] = {{1,4,9},{11,4,3},{2,2,3}};
   // printSum(mat);
   Printsum(mat);
}

public static void printSum(int mat[][]){
    int sum = 0;
    int startrow = 1;
    int endrow = mat.length;
    int startcol = 0;
    int endcol = mat[0].length;
    for (int i = startrow; i < endrow; i++) {
        for (int j = startcol; j < endcol; j++) {
            if(i==1)
              sum+= mat[i][j];
        }
    }
    System.out.println("sum is :"+sum);
}

//================== optamise way ==============
public static void Printsum(int mat[][]){
    int sum = 0;
    for (int i = 0; i < mat[1].length; i++) {
        sum+= mat[1][i]; 
    }
    System.out.println("sum is :"+sum);

}
}
