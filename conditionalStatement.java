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
    public static void main(String[] args) {
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

    }
}

