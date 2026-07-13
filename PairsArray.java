public class PairsArray {
   /*  public static void ArrayPairs(int n[]){
        int tp = 0;
       for (int i = 0; i < n.length; i++) {
           int current = n[i]; // 2,4,6,8,10
           for (int j = i+1; j < n.length; j++) {
             System.out.print("(" + current + ","+n[j]+")");
             tp++;
             }
          System.out.println();
        } 
        System.out.println("total pairs :"+tp);
    }
    public static void main(String[] args) {
    int n[] = {2,4,6,8,10};

    ArrayPairs(n);
    }

    // Printing Subarray--
    public static void findSubArray(int n[]){
        int totalSubArray = 0;
        
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                   System.out.print(n[j2]+" ") ;
                  sum += n[j];
                }
                System.out.println("sum = "+sum);
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray is : "+totalSubArray);
        
    }
    public static void main(String[] args) {
      int n[] = {2,4,6,8,10};
      findSubArray(n);  
    }*/


// brute Force
   public static void FindMaxSubArray(int n[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n.length; i++) {
        
        for (int j = i; j < n.length; j++) {
           currSum = 0; 
           for (int j2 = i; j2 <= j; j2++) {
            currSum += n[j2];
           }
           System.out.println(currSum);
           if(maxSum < currSum ){
                maxSum = currSum;
            }
        }
    }
    System.out.println("MaxSum = "+maxSum);
    
   }
    public static void main(String[] args) {
        int n[] = {2,4,6,8,10};
     FindMaxSubArray(n);   
    }
}
