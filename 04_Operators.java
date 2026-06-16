
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
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!b);
    }
