public  class statics{

    public static void main(String a[]){
     students s1=new students();
     s1.name = "nainsi";
     System.out.println(s1.name);
     s1.roolno = 54;
     System.out.println(s1.roolno);
     s1.collegeName ="bhavans  college";
     System.out.println(s1.collegeName);
     System.out.println(s1.marks(34,45,77));
     students s2=new students();
     s2.collegeName = "spit";
     System.out.println(s2.collegeName);
     System.out.println(s1.collegeName);
    }
}

class students{
    String name;
    int roolno;
    students(){
        System.out.println("this is students class costructor");
    }
    {
        System.out.println("this is static class constructor");
    }

    static String collegeName;
    static int marks(int p,int m, int c){
       return (p+c+m)/3;
    }
}