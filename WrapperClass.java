
/*
 * TOPIC: WRAPPER CLASS IN JAVA
 
 * A Wrapper Class in Java is a class that converts
 primitive data types into objects.
 
 * Java provides 8 wrapper classes for 8 primitive
  data types.
 
 * Primitive Data Type     Wrapper Class
 -------------------------------------
  byte                    Byte
  short                   Short
  int                     Integer
  long                    Long
  float                   Float
  double                  Double
  char                    Character
  boolean                 Boolean
 
 * WHY DO WE USE WRAPPER CLASSES?
 
  1. To convert primitive values into objects.
  2. To use primitive values in Collections like
     ArrayList and HashMap.
  3. To use built-in methods provided by wrapper classes.
  4. Wrapper objects can store null values.
 
 * AUTOBOXING:
 * Automatic conversion of primitive data type
  into its corresponding wrapper object.
 
 * Example: int -> Integer
 
 * UNBOXING:
 * Automatic conversion of wrapper object
 into its corresponding primitive data type.
 
 * Example: Integer -> int
 */




public class WrapperClass {

    public static void main(String[] args) {

        // Example 1: Wrapper Class

        int a = 10;

        Integer b = Integer.valueOf(a);

        System.out.println("Primitive value: " + a);
        System.out.println("Wrapper object: " + b);


        // Example 2: Autoboxing

        int num = 20;

        Integer obj = num;

        System.out.println("Autoboxing: " + obj);


        // Example 3: Unboxing

        Integer x = 30;

        int y = x;

        System.out.println("Unboxing: " + y);

    }
}



