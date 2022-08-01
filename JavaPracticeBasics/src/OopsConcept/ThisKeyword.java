package OopsConcept;

class Student1{

    int rollNo;
    String name;
    static String college ="PICT";
    float fee;

    // this to refer current class instance variable i.e. to remove ambiguity of variable with same name
    Student1(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    // this to invoke current class constructor to reuse constructor from constructor. It is called chaining constructors.
    Student1(int rollNo,String name,float fee){
        this(rollNo, name);
        this.fee = fee;
    }

    Student1(){
        String name ="Ajay";
        int rollNo = 4;
    }
    void display(){
        System.out.println(rollNo+"  "+name+"  "+college+"  "+fee);
    }

    void method1(){
        System.out.println("This is PArent Method");
    }

    //Invoking one method from another method can be done using this keyword. It is optional. Even if we don't use this
    // Keyword Java compiler will automatically add it in the background
     void method2(){
        System.out.println("This is child method");
        this.method1();
        method3(this); // this a method parameter
    }

    void method3(Student1 obj){
        System.out.println("this as Method Parameter");
    }

}
public class ThisKeyword{

    public static void main(String[] args) {

        Student1 s1 = new Student1(1, "Arun");
        Student1 s2 = new Student1(1, "Atul", 5400);
        s1.display();
        s2.display();
        s1.method2();
        Student1 s3 = new Student1();

    }
}
