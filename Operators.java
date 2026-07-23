
// 1. Arithmetic operator(binary operator/unary operator)
// Binary operator(+ ,-,*,/,%)
/*public class operators {
    public static void main(String[] args) {
       int a = 3;
       int b = 8;
       System.out.println(a+b); 
       System.out.println(a-b); 
       System.out.println(a*b); 
       System.out.println(a/b); 
       System.out.println(a%b); 
          
    }
  
}



    // Unary operator

    // Rules for Increment and Decrement :
    //  1. can not applied to constant 
    // 2. Nesting of both operators is not allowed(Example - int a=7;int b=++(++a) // compile time error) 
    // 3. they are not operated over final variables(Example - final int a=10;int b=++a  // compile time error)  
    // 4. Increment and Decrement Operators  can not be appied to Booleans(Example - boolean a=false;a++;  // compile time error).

    public static void main(String[] args) {
        int a = 7;
        // Increment ------->
        System.out.println(a++);  //post increment
        System.out.println(++a);  // pre increment
        
        //  Decrement
        System.out.println(a--);  //post decrement
        System.out.println(--a);  // pre decrement
    }






    // 2. Relational operators(==,!=,<,>,>=,<=)

    public static void main(String[] args){
        int a = 88;
        int b = 55;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }

    // 3. Logical operators (&&,||,!)
    public static void main(String[] args){
        int a = 4;
        int b = 7;

        System.out.println(a>b  && b<a);
        System.out.println(a<b||b>a);
        System.out.println(a!=b);
    }



     // 4. ShortHand  Operators 
    // the assignment operators can be combind with other operators to build a shorter version of the statement .(+=,-=,*=,/=,%=)
   public static void main(String[] args) {
    int a = 5;
    int b = 7;
    System.out.println(a += 1); // a = a+1
    System.out.println(b *= 2); // b = b*2
    
   }


   // 5. Bitwise operators
   /*  Bitwise operators work on a binary equivalent of decimal numbers
   1. first the operands are converted to their binary representation .
   2. Next the operator is applied to each binary number and the result is calculated.
   3. Finally, the result is converted back to its decimal representation.*/

   // Bitwise Logical

   /*1.Bitwise AND (&) : If both the bits are 1, the solution has 1 in that bit position else 0.
   Its Truth Table : 
   1. 1&0 => gives 0
   2. 0&1 => gives 0
   3. 0&0 => gives 0
   4. 1&1 => gives 1
   6 = 0110(in Binary), 8 = 1000(in Binary) 0110 & 1000 -> 0000 = 0(in decimal) */

    public static void main(String[] args) {
    int a = 9;
    int b = 8;
    int result = a & b ;
    System.out.println(result);
   }

/* 2. Bitwise OR(|) : if any bits is 1 then it will give 1.
its Truth Table : 
1. 1|0 => gives 1
2. 0|1 => gives 1
3. 0|0 => gives 0
4. 1|1 => gives 1*/

 

public static void main(String[] args){
    System.out.println(6|8);
}

/* 2. Bitwise XOR(^)  
If the bits are opposite, the solution has a 1 in that
 bit position and if they are matched,a 0 is returned . 
 Its  Truth Table :
 1. 1^0 =>  gives 1
 2. 0^1 => gives 1
 3. 0^0 => gives 0
 4. 1^1 => gives 0*/

public static void main(String[] args){
    System.out.println(6^8);
}

/*3. Bitwise shift(>>,<<,>>>) --> 
shifts each digit in a number's binary representation left(<<) or right(>>) 
by as many spaces as specified by the second operand. */

// 1. left shift : 2<<1
public static void main(String[] args){
    System.out.println(2<<1);
}

// 2<<1 => 0010<<1 =>0100 =>4(in decimal).

// 2. Right shift(8>>2)
public static void main(String[] args){
    System.out.println(8>>2);
}

// 8>>2 =>10002 =>0010 =>2(in decimal).