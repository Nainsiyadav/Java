// LOOPS---->
/*When we want to perform certen task again and again till a given condition.
Looping is a feature thatfacilitates the execution of a set of instructions
repeatedly until a certain condition holds false.*/

// ----For Loop ----
// When we know the exact number of items the loop is going to run, we use for loop.

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class loops {

    public static void main(String[] args) {
        /*for(int i =1;i<=5;i++){
            System.out.println(i);
    }
        // In loops, initialization, condition, and change all are optional. any or all of 
        // these are skippable. The loop essentially works based on the semicolon;
        for (;;) {
            System.out.println("this is an infinite loop");
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your number here : ");
        int n = sc.nextInt();
        for (int j= 1; j < n; j++) {
          System.out.println(j);  
        }

        // reverse loop
        for (int i = n; i >=1; i--) {
          System.out.println(i) ; 
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = sc.nextInt();
       
        /*int sum = 0;
        for (int i = 1; i < a; i++) {
            sum += i;
        }
        System.out.println(sum);*/
        int fact = 1;
        for (int i = 2; i <= a; i++) {
            fact *= i;
        }
        System.out.print("factorial is "+fact);
        }
    }
