package Polymorphism;

// Super keyword is used to invoke immediate parent class method
// Super is also used to invoke immediate parent class constructor
// Super is used to refer to immediate parent class instance variable

class Animal2{

    String type = "dog";
}

class Dog2 extends Animal2{
    String type = "bird";
    void display(){
        System.out.println(type);
        System.out.println(super.type);
    }
}

public class SuperKey{

    public static void main(String[] args) {

        Dog2 a = new Dog2();
        a.display();
    }
}
