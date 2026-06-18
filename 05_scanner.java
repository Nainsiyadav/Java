
//------------- Scanner-------------
/*  To take input from users we use Scanner class.
    Scanner class is a built-in class in the java.util package. 
    Before using the Scanner class you have to import the Scanner class
     using the import statement as shown below :*/

// to use Scanner class, you need to create an object of it,
// and then you can use that object to interact with the input data.


import java.util.Scanner;
public class scanner {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter your age :");
    int age = sc.nextInt();
    // the nextInt()  method parses the token from the input and returns the integer value. 
    
}
    
}
