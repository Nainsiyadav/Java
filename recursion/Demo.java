public class Demo {
   /*public static void returnNumber(int n) {
      if (n == 1) {
         System.out.print(n);
      } else {
         System.out.print(n + " ");
         returnNumber(n - 1);
      }
   }*/
   public static void returnInc(int n){
    if(n==1){
        System.out.print(n+" ");
        return;
    }
    
    returnInc(n-1);
    System.out.print(n+" ");
   }
   public static int fact(int n){
    if(n==0){
        return 1;
    }
    fact(n-1);
    int factOfnminusOne = fact(n-1)*n;
    return factOfnminusOne;
   }
   public static int sum(int n){
    if(n==1){
        return 1;
    }
    sum(n-1);
    int Finalsum = sum(n-1)+n;
    return Finalsum;
   }
   public static void main(String[] a) {
      int n = 5;
      //returnNumber(n);
      //returnInc(n);
      //System.out.print(fact(n));
      System.out.print(sum(n));
   }
  
    
}
