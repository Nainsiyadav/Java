// Conditional-flow Statements
/*Control Flow statements in programming control the order of execution of 
statements within a progaram. They allow you to make decisions, repeat
actions, and control the flow of your code based on conditions.

Types of control flow statements
1. Conditional or Decision Making statements (if-else and switch)
2. Looping statements(For,while,and do-while)
3. Branching statements(break and contiue)


1. Conditional or Decision Making statements (if-else and switch)*/
import java.util.Scanner;
public class conditionalStatement {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter first number : ");
        int a = sc.nextInt();
        System.out.print("please enter your second number : ");
        int b = sc.nextInt();
        if(a>b){
            System.out.print("a is greater than b :");
        }else if(b>a){
            System.out.println("b is grater than a");
        }else{
            System.out.println("both numbers are equal");
        }

    }*/

        /* If ladder: 
        The program checks each if condition,and as soon as one of
        the if condition yields true, it execute the statement inside 
        that if block and still check further condition. If none of
        conditions evaluates to be true the program executes the statement
        of the final else block.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("please enter the number : ");
            int n = sc.nextInt();
            if(n>0){
                System.out.println("number is positive ");
            } if(n<20){
                System.out.println("number is less than 20 ");
            }if(n%2==0){
                System.out.println("number is even ");
            }
        }*/



    /*  Ternary operator --->

    The ternary operator, also known as the conditional operator,
    is a shorthand way of writing an if-else statement with a single
    expression.
    public static void main(String[] args) {
        int num =65 ;
        String result = (num %2==0) ? "Even" : "Odd";
        System.out.print("the number is "+result);
    }*/

    /* Type conversion ---
    Type casting in java is the process of converting one data type to another .
    It can be done automatically or manually.
    
    Type casting in Java is mainaly of two types.
    1. Wildening or Implicit tpye casting 
    2. Narrow or Explicit type casting 
    
    1. Wildening or emplicit Conversion :
    Java allows automatic type conversion when a smaller data type is promoted to a 
    larger data type.
    
    Order : byte->short->int->long->float->double
    
    2. Explicit or Narrowing Conversion:
    Sometime, we need to convert a larger data type to smaller one explicitly 
    and it requires a cast operator.
    
    Note : Shorthand operators do implicit conversion.
    byte b = 1;
    b = b+2; // error , 2 is int(all non-float by default int) so can't store in byte.
    
    b += 2; // work perfectly as += did implicit conversion.*/

    public static void main(String[] args) {
        double d_value = 42.0;
        int i_value = (int) d_value; // explicit conversion(Casting)
    }

}


