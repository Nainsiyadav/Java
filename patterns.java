import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        public static void main(String a[]){

        for (int i = 1; i <= 9; i++) {
          for (int j = 1; j <= i; j++) {
            System.out.print(i+" ");
        }
         System.out.println(); 
      }

    public static void main(String a[]){

      for (int i = 1; i <= 9; i++) {
       for (int j = 1; j <= i; j++) {
        System.out.print(j+" ");
      }
       System.out.println();
    }
    }

    // hollow rectangle 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter total row : ");
        int totrow = sc.nextInt();
        System.out.print("please enter total column : ");
        int totcol = sc.nextInt();
        for (int i = 1; i <=totrow; i++) {
            for (int j = 1; j <= totcol; j++) {
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    // solid rectengle 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a total number of  rows: ");
        int rows=sc.nextInt();
        System.out.print("please enter a total number of  cols: ");
        int cols=sc.nextInt();
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j<=cols; j++) {
               System.out.print("*");  
            }
            
            System.out.println();
        }
    }
   //hollo_rhombus
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("please enter a total number of  rows: ");
        int r=sc.nextInt();
        
        for (int i = 1; i <=r; i++) {
            //space
            for (int j = 1; j <=(r-i); j++) {
               System.out.print(" ") ;
            }
            //star
            for (int j = 1; j <=r; j++) {
              if(i==1||i==r||j==1||j==r){
                System.out.print("*");
              }else{
                System.out.print(" ");
               }
           
            }  
         System.out.println(); 
        }
        
        
   }
  //solid_rhombus
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for (int i = 1; i <=n; i++) {
        //speace
        for (int j = 1; j <=(n-i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=n; j++) {
           System.out.print("*") ;
        }
        System.out.println();
    }
   }
  // diamond
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("please  enter a number :");
        int a=sc.nextInt();
        //first half
        for (int i = 1; i <=a; i++) {
            //speace
            for (int j = 1; j <=(a-i); j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i = a; i >=1; i--) {
          //speace
          for (int j = 1; j <=(a-i); j++) {
            System.out.print(" ");
          } 
          //star
          for (int j = 1; j <=(2*i)-1; j++) {
            System.out.print("*");
          } 
          System.out.println();
        }

    }

  
}
