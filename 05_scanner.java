
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

// Use methods to read respective data  
// nextyte(),nextShort(),nextInt(),nextLong(),nextFloat(),nextDouble(),nextBoolean()

/*  Reading String Data--
nextLine() - Reads the whole line
 next() - Reads the first word */

/* Reading Char Data : next().charAt(0)  */

//--------- Problem with nextLine() method :  ---------
/* If we try to read String after reading in an Integer, Double or Float etc.

Java does not give us a chance to input anything for the name variable. 
When the method input.nextLine() is called Scanner object will wait for us, to hit enter 
and the enter key is a character("\n")*/


//Example -
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter an integer: ");
int age = scanner.nextInt();

System.out.print("Enter a string: ");
String name = scanner.nextLine();

System.out.println(name + " age is = " + age);
}

/*Console :

Enter an integer: 69
Enter a string: age is = 69

1. We first prompt the user to enter an integer age using nextInt().

2. After reading the integer, we immediately hit enter and enter is also a 
character represented by "\n" - 69\n

3. The int value 69 is assigned in age but not the \n still left in the
 memory or buffer.

4. In next line when we Call nextLine() to consume the name It first check 
in buffer Is there any thing as we have \n in buffer it take \n (for nextLine() 
method \n is the stopping point it will consider we stop giving input 
and return) and skip the line.

Solutions -*/
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter an integer: ");
int age = scanner.nextInt();

// Consume the newline character left in the input buffer
scanner.nextLine();

System.out.print("Enter a string: ");
String name = scanner.nextLine();

System.out.println(name + " age is = " + age);
}

/*1. After taking an integer input we Call nextLine() to consume the name character left 
in the input buffer. In next line when we Call nextLine() to consume the name character 
left in the input buffer.

2. Then, we prompt the user to enter a string using nextLine().

Escape Sequence(\)

\n (next Line), \b (backspace), \t (tab), \" (double quote), \' (single quote), and \\ (backslash).*/

