public class Strings {
    public static void PrintLetters(String str3){
        for (int i = 0; i < str3.length(); i++) {
            System.out.print(str3.charAt(i)+" ");
        }
        System.out.println();
    }
    public static boolean isPalindrom(String str){
       
        for (int i = 0; i <str.length()/2; i++) {
             int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrom
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";
    //String str1 = "Nainsi";
    //String str2 = "Yadav";
    //String str3 = str1+" "+str2;
   // System.out.println(str3);
    //System.out.println("Lenght  is "+str3.length());
    //PrintLetters(str3);
    System.out.println(isPalindrom(str));
    }
}