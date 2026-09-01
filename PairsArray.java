public class PairsArray {
    public static void ArrayPairs(int n[]){
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
    }


// brute Force Method
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
    }*/

   // Prefix Array Method
   public static void FindMax(int n[]){
    int currSum = 0;
    int MaxSum = Integer.MIN_VALUE;
    int prefix[] = new int[n.length];
    // Calculate Prefix array
    prefix[0] = n[0];
    for (int i = 1; i < prefix.length; i++) {
        prefix[i] = prefix[i-1] + n[i];
    }
    //Finding start and end
    for (int i = 0; i < n.length; i++) {
        
        for (int j = i; j < n.length; j++) {
            currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

            if(MaxSum < currSum){
              MaxSum = currSum;
            }
        }
    }
    System.out.println("Max Sum  = "+MaxSum);
   }

   public static void kadans(int n[]){
    int cs = 0;
    int ms = 0;
    for (int i = 0; i < n.length; i++) {
        cs += n[i];

        if(cs < 0){
            cs = 0;
        }
        ms = Math.max(ms, cs);
    }
    System.out.println("Max sum of subarray is : "+ms);
   }
   public static void main(String[] args) {
    int n[] = {-2,-3,4,-1,-2,1,5,-3};
    //FindMax(n);
    kadans(n);
   }
}
