import java.util.Scanner;
public class practice {
    public static void SpiralMatrix(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr.length-1;
        while(startRow <= endRow & startCol <= endCol){
            //----------top---------
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j]+" ");
            }
            //---------right-------
            for (int i = startRow+1; i <= endRow ; i++) {
                System.out.print(arr[i][endCol]+" ");
            }
            //---------bottom--------------
            for (int j =endCol-1 ; j >= startCol ; j--) {
                System.out.print(arr[endRow][j]+" ");
            }
            //-------------left-----------
            for (int i = endRow-1; i >= startRow+1; i--) {
                System.out.print(arr[i][startCol]+" ");
                
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }
    public static int TrappedWater(int height[]){
        //left boundry
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //-----right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        //-------calculate trappedwater---------
        int trappedwater =  0;
        for (int i = 0; i < height.length; i++) {
            int WaterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedwater += WaterLevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String a[]){
   int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
   System.out.println(TrappedWater(height));

    // Scanner sc=new Scanner(System.in);
    // System.out.print("Eter numberof rows : ");
    // int n = sc.nextInt();
    // System.out.print("Enetr number of columns : ");
    // int m = sc.nextInt();
    // int arr[][] = new int[n][m];

    // for (int i = 0; i < n; i++) {
    //     for (int j = 0; j < m; j++) {
    //         System.out.print("enetr "+((i+1)+","+(j+1))+" elements : ");
    //         arr[i][j] = sc.nextInt();
    //     }
    // }

    // SpiralMatrix(arr);

    }
}
