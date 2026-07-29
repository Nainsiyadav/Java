public class BitManipulation {
    // find wether number is even or odd 
    public static void getEven(int n){
        int bitMask = 1;
        if((n&bitMask) == 0){
            System.out.println("number is even ");
        }else{
            System.out.println("number is odd ");
        }
    }
  //  find ith bit 
  public static int getBit(int n , int i){
    int bitMask = 1<<i;
    if((n&bitMask)==0){
        return 0;
    }else{
        return 1;
    }
  }
  public static int setithBit(int n, int i){
    int bitMask = 1<<i;
    return n | bitMask;
  }
  // clear ith bit 
  public static int clearIthBit(int n , int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
  }
    public static void main(String[] args) {
        
    /*System.out.println(5&4);
    System.out.println(5|4);
    System.out.println(5^2);
    System.out.println(~5);
    System.out.println(5<<2);
    System.out.println(5>>2);*/
    //getEven(4);
    //System.out.println(getBit(10, 3));
    //System.out.println(setithBit(10, 3));
    System.out.println(clearIthBit(10, 3));
    }
}