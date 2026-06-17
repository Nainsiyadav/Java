
// 1. Arithmetic operator(binary operator/unary operator)
// Binary operator(+ ,-,*,/,%)
public class operators {
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

