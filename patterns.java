import java.util.Scanner;

public class patterns {
    
 // pattern--1
    // public static void main(String a[]){

    //     for (int i = 1; i <= 9; i++) {
    //       for (int j = 1; j <= i; j++) {
    //         System.out.print(i+" ");
    //     }
    //      System.out.println(); 
    //   }


    //----------------------------------------------------------------------------------------------
// pattern -- 2
    // public static void main(String a[]){

    //   for (int i = 1; i <= 9; i++) {
    //    for (int j = 1; j <= i; j++) {
    //     System.out.print(j+" ");
    //   }
    //    System.out.println();
    // }
    // }


 //---------------------------------------------------------------------------------------------------   
    // pattern --3 - hollow rectangle 
    // public static void main(String args[]){
    //     int n = 10;
    //     for (int row = 1; row <=n; row++) {
    //         for (int col = 1; col <= 8; col++) {
    //             if(row==1 || row==n){
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 if(col==1 || col==8){
    //                     System.out.print("* ");
    //                 }
    //                 else{
    //                     System.out.print("  ");
    //                 }
    //             }
    //         }
    //         System.out.println();
        
            
    //     }
    // }

    
    
    //-----------------------------------------------------------------------------------------
    //  pattern -- 4 - solid rectengle 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter a total number of  rows: ");
//         int rows=sc.nextInt();
//         System.out.print("please enter a total number of  cols: ");
//         int cols=sc.nextInt();
//         for (int i = 1; i <=rows; i++) {
//             for (int j = 1; j<=cols; j++) {
//                System.out.print("*");  
//             }
            
//             System.out.println();
//         }
//     }


//-----------------------------------------------------------------------------------------------------------------------
//    pattern - 5-hollo_rhombus
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//         System.out.print("please enter a total number of  rows: ");
//         int r=sc.nextInt();
        
//         for (int i = 1; i <=r; i++) {
//             //space
//             for (int j = 1; j <=(r-i); j++) {
//                System.out.print(" ") ;
//             }
//             //star
//             for (int j = 1; j <=r; j++) {
//               if(i==1||i==r||j==1||j==r){
//                 System.out.print("*");
//               }else{
//                 System.out.print(" ");
//                }
           
//             }  
//          System.out.println(); 
//         }
        
        
//    }


//------------------------------------------------------------------------------------------------
//   // pattern - 6 - solid_rhombus
//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     for (int i = 1; i <=n; i++) {
//         //speace
//         for (int j = 1; j <=(n-i); j++) {
//             System.out.print(" ");
//         }
//         for (int j = 1; j <=n; j++) {
//            System.out.print("*") ;
//         }
//         System.out.println();
//     }
//    }


//-----------------------------------------------------------------------------------------------------------------------
//   pattern - 7 - diamond
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("please  enter a number :");
//         int a=sc.nextInt();
//         //first half
//         for (int i = 1; i <=a; i++) {
//             //speace
//             for (int j = 1; j <=(a-i); j++) {
//                 System.out.print(" ");
//             }
//             //star
//             for (int j = 1; j <=(2*i)-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //second half
//         for (int i = a; i >=1; i--) {
//           //speace
//           for (int j = 1; j <=(a-i); j++) {
//             System.out.print(" ");
//           } 
//           //star
//           for (int j = 1; j <=(2*i)-1; j++) {
//             System.out.print("*");
//           } 
//           System.out.println();
//         }

//     }*/

 
//---------------------------------------------------------------------------------------------------------------------
//  pattern - 7 - butterfly
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("please enter your number : ");
//         int n = sc.nextInt();
//         //first - half
//         for (int i = 1; i <=n; i++) {
//             //star
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             //speace
//             for (int j = 1; j <= 2*(n-i); j++) {
//                 System.out.print(" ");
//             }
//             //star
//             for (int j = 1; j <=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // Second - half
//         for (int i = (n-1); i >= 1; i--) {
//             //star
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             //speace
//             for (int j = 1; j <= 2*(n-i); j++) {
//                System.out.print(" "); 
//             }
//             //star
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//------------------------------------------------------------------------------------------------
// pattern - 8 - trangle 
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Please enter number of rows : ");
//     int totrows = sc.nextInt();
    

//     for (int i = 0; i <= totrows; i++) {
//         for (int j = 0; j <= i; j++) {
//             System.out.print("*"+" ");
//         }
//         System.out.println();
//     }
// }

//-------------------------------------------------------------------------------------------------------
// pattern - 9 -solid rectangle

// public static void main(String args[]){
//     int n = 4;
//     int col = 7;

//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j < col; j++) {
//            System.out.print("*"+" "); 
//         }
//       System.out.println();  
//     }
// }


//-------------------------------------------------------------------------
// pattern - 10 - inverted trangle

// public static void main(String[] args) {
//     int n = 5;
//     for (int i = n; i >=1 ; i--) {
//       for (int j = n; j >=(n-i+1); j--) {
//         System.out.print("*");
//       }  
//       System.out.println();
//     }
// }

// pattern - 11 - 
// public static void main(String[] args) {
//     int n=5;
//     for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= (n-i); j++) {
//         System.out.print(" ");
//        } 
//        for (int j = 1; j <= (2*i-1); j++) {
//         System.out.print("*"+" ");
//        }
//        System.out.println();
//     }
// }


// pattern - 12 - piramide
// public static void main(String[] args) {
//     int n=5;
//     for (int i = 0; i < n; i++) {
//          for (int j = 0; j <= n-i; j++) {
//           System.out.print(" ");  
//         }
//         for (int j = (2*i-1); j>=1 ; j--) {
//             System.out.print("* ");
//         }
       
//         System.out.println();
//     }
// }


//----------------------------------------------------------------------------
// pattern - 13 - inverted piramide 

// public static void main(String[] args) {
//     int n = 4;
//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= i-1; j++) {
//            System.out.print(" "); 
//         }
//         for (int j = 1; j <= (2*n-2*i+1); j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
        
//     }
// }


//-------------------------------------------------------------------------------------
// pattern - 14 - hollow right trangle 

// public static void main(String[] args) {
//     int n = 10;
//     for (int row = 1;row<=n ; row++) {
//         if(row==1 || row==2 || row==n){
//             for (int col = 1; col <= row; col++) {
//             System.out.print("* ");
//             }
//         }else{
//             System.out.print("* ");
//             for(int col=1;col<=(row-2);col++){
//                 System.out.print("  ");
//             }
//             System.out.print("* ");

//         }
//         System.out.println();
//     }
// }


//-------------------------------------------------------------------------------------------------
//
 }
