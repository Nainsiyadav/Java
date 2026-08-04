public class copyConstructor {
    String name;
    int rollno;
    String password;
    int marks[];
    copyConstructor(){
       marks = new int[3];
       
       System.out.println("constructor are called");
    }
    copyConstructor(String nname){
        marks = new int[3];
        this.name = nname;
    }
    copyConstructor(int nrollno){
        marks = new int[3];
        rollno= nrollno;
    }
    // shallow copy constructor 
    // copyConstructor(copyConstructor s1){
    // marks = new int[3];
    //  this.name=s1.name;
    //  this.rollno=s1.rollno;
    //  this.marks=s1.marks;
    // }
    copyConstructor(copyConstructor s1){
    marks = new int[3];
     this.name=s1.name;
     this.rollno=s1.rollno;
     for (int i = 0; i < marks.length; i++) {
        this.marks[i] = s1.marks[i];
     }
    }
    public static void main(String[] args) {
    copyConstructor s1 = new copyConstructor();
    s1.name = "nainsi";
    s1.rollno = 54;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    copyConstructor s2=new copyConstructor(s1);
    s2.password = "xyz";
    s2.marks[2] = 100;
    for (int i = 0; i <3 ; i++) {
        System.out.println(s2.marks[i]);
    }

    }
}
