package Polymorphism;

class Student{

    void area(int l,int b){
        System.out.println("Area ="+l*b);
    }

    void area(int l,int b, int w){
        System.out.println(l+b+w);
    }

    void area(long r){
        System.out.println(3.14*r*r);
    }
}
public class MethodOverloading{

    void run(){
        System.out.println("Local class overloading");
    }

    void run(int r){
        System.out.println(r*r);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.area(4);
        s.area(5,7);
        s.area(4,6,8);
        MethodOverloading m = new MethodOverloading();
        m.run();
        m.run(4);

    }

}
