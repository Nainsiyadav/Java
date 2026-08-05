public class supers {
    public  static void main(String a[]){
    hours h1=new  hours();
    System.out.println(h1.color);
    }
}

class animal{
    String color="pink";
    int numberofAimals;
    animal(){
        System.out.println("parent's class constructor called ");
    }
}

class hours extends animal{
    String color;
    hours(){
        System.out.println("this is judt check");
        this.color="red";
        super();
       System.out.println(super.color);
        System.out.println("child class constructor called");
    }
}

