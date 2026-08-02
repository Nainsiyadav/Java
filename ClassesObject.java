public class ClassesObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();//   object creation 
        p1.getcolor("black");
        System.out.println(p1.color);
        p1.gettip(7);
        System.out.println(p1.tip);
        Bankacc b1 = new Bankacc();
        b1.setName("nainsi");
        System.out.println(b1.accName);
        b1.setpsw("nbyuhsvda");// we make password privet that's whay we can't print  password we can set the  password but can't see
       
    }
    
}
class Pen{
    String color;
    int tip;

    void getcolor(String newcolor){
        color = newcolor;
    }
    void gettip(int newtip){
        tip = newtip;
    }
}
class Bankacc{
    String accName ;
    private String password;
    void setName(String newName){
        accName = newName;
    }
    void setpsw(String psw){
        password = psw;
    }

}