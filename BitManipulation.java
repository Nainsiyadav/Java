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
  public static int updateIthit(int n, int i, int newBit){
    if(newBit == 0){
      return clearIthBit(n, i);
    }else{
      return setithBit(n, i);
    }
  }
  public static int clearLastbit(int  n, int i){
    int bitMask = (~0)<<i;
    return n & bitMask;
  }
  public  static int clearBitinRange(int n , int i,int j){
    int a = (~0)<<(j+1);
    int b = (1<<i)-1;
    int bitMask = a|b;
    return n & bitMask;

  }
  public static boolean ispower(int n){
   return (n&(n-1))==0;
  }
  public static int countsetbit(int n){
    int count = 0;
    while(n>0){
      if((n&1) == 0){
        count++;
      }
      n = n>>1;
    }
    return count;
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
    //System.out.println(updateIthit(10, 2, 1));
    //System.out.println(updateIthit(10, 2, 0));
    //System.out.println(clearLastbit(15,2));
    // System.out.println(clearBitinRange(10,2,4));
    // System.out.println(ispower(15));
    //System.out.println(countsetbit(10));
    }
}