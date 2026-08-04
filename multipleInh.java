public class multipleInh {
    public static void main(String[] args) {
      bear b=new bear();
      b.eat();
      b.eats();  
    }
}

interface Herbivore{
    void eats();
}
interface Carbivore{
    void eat();
}
class bear implements Herbivore, Carbivore{
    bear(){
        System.out.println("bear class constructor called");
    }
    public void eats(){
        System.out.println("eting grass");
    }
    public void eat(){
        System.out.println("etting non-veg");
    }
}
