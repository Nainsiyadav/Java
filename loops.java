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
        for(int i =1;i<=5;i++){
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
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = sc.nextInt();
       
        int sum = 0;
        for (int i = 1; i < a; i++) {
            sum += i;
        }
        System.out.println(sum);
        int fact = 1;
        for (int i = 2; i <= a; i++) {
            fact *= i;
        }
        System.out.print("factorial is "+fact);
        }
    }



// While loop-------
/*The while loop is used when the number of iterations is not known but the
terminating condition is known.
Loop is executed until the given condition evaluates to false. */

import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }

      
        while(i>9){   // false condition but no syntax error
            System.out.println(i);
        }

        // While loop always accepts true , if you initially give false(Boolean value) 
        // it will give syntax error.

        while(false){
            System.out.println("hello LOLU"); 
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = sc.nextInt();
         int j = 1;
        while(j<=10){
            System.out.println(j+" X "+n+" = "+n*j);
            j++;
        }

        int j = 1;
        int  fact = 1;
        while(j<=n){
            fact *= j;
            j++;
        }
        System.out.println(fact);

    }
}
