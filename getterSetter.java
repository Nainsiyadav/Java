public class getterSetter {
    class Pen{
       private int tip = 5;
       private String color = "black";
        String getcolor(){
            return color;
        }
        int gettip(){
            return tip;
        }
        void setcolor(String newcolor){
            this.color = newcolor;
        }
        void settip(int newtip){
            this.tip = newtip;
        }
    }
    public static void main(String[] args) {
    //     getterSetter obj=new getterSetter();
    //     Pen p1=obj.new Pen();
    //    System.out.println(p1.getcolor());
    //    System.out.println(p1.gettip());
    //    p1.setcolor("blue");
    //    System.out.println(p1.getcolor());
    //    p1.settip(8);
    //    System.out.println(p1.gettip());
    bank boj = new bank();
    System.out.println(boj.getname());
    boj.setname("rishu");
    System.out.println(boj.getname());
    System.out.println(boj.getpassword());
    boj.setpsswd("123456878");
    System.out.println(boj.getpassword());
    }
}
class bank{
    private String name = "nainsi";
    private String password = "hgyuwvd";
    String getname() {
        return name;
    }
    String getpassword(){
        return password;
    }
    void setname(String nname){
        this.name = nname;
    }
    void setpsswd(String pws){
        this.password = pws;
    }

}
