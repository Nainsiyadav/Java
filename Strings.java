import java.util.Scanner;
public class Strings {
   /*  public static void PrintLetters(String str3){
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
    public static String getSubString(String str,  int si, int ei){
        String s = "";
        for (int i = si; i < ei; i++) {
           s += str.charAt(i) ;  
        }
        return s;
    }
    public static void main(String[] args) {
        String str = "Nainsi";
         //build in substring function 
         System.out.println(str.substring(2,6));
    //String str1 = "Nainsi";
    //String str2 = "Yadav";
    //String str3 = str1+" "+str2;
   // System.out.println(str3);
    //System.out.println("Lenght  is "+str3.length());
    //PrintLetters(str3);
    //System.out.println(isPalindrom(str));
    String s1 = "Nainsi";
   // System.out.println(getSubString(str, 4, 6));

    /*String s2 = "Nainsi";
    String s3 = new String("Nainsi");
    if(s1 == s3){// check memory location 
        System.out.println("s1 and s2 are equals ");
    }else{
        System.out.println("S1 and s2 are not equals ");
    }

    if(s1.equals(s3)){// check only values 
        System.out.println("s1 and s3 are equals");
    }else{
        System.out.println("s1 and a3 are not equals ");
    }*/

    public static String getLargest(String fruits[]){
         // compare
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0){
              largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of String : ");
        int n = sc.nextInt();
        String fruits[] = new String[n];
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("enter "+i+1+" element : ");
            fruits[i] = sc.next();
        }
        
       System.out.println(getLargest(fruits));
    }

    }
