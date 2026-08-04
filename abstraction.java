public class abstraction {
    public static void main(String[] args) {
      chicken c = new chicken();
      c.color();
      c.eat();
      c.walk(); 
    }
}

abstract class animal{
    animal(){
        System.out.println("animal class  constructor called");
    }
   void eat(){
    System.out.println("EATS");
   }
   abstract void walk();
}
class hours extends animal{
    hours(){
        System.out.println("hours class constructor called");
    }
    void walk(){
        System.out.println("walk by 4 legs");
    }
    void color(){
        System.err.println("brown");
    }
}
class chicken extends hours{
    chicken(){
        System.out.println("chicken class constructor called");
    }
    void skincolor(){
        System.out.println("yellow");
    }
}
