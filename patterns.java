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
}
