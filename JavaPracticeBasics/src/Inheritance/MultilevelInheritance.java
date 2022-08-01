package Inheritance;
class Student{

    String name = "Rajveer";
    int rollNo = 1;
}

class Student2 extends Student{
    static String college = "KPIT";
}

class Student3 extends Student2{
    float fees = 4200;

    void display(){
        System.out.println(college);
    }
}
public class MultilevelInheritance{

    public static void main(String[] args) {
        Student3 s = new Student3();
        System.out.println(s.name+" "+s.rollNo+" "+s.fees);
        s.display();


    }

}
