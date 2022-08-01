package Polymorphism;

class Animal{

    void bark(){
        System.out.println("Barking Dog");
    }
}
class Dog extends Animal{
    //Method Overridden from parent class
    //To call method from parent class use object of parent class and to call method of child class use child class object
    void bark(){
        System.out.println("Dog is barking");
    }

}
public class MethodOverriding{

    void bark(){
        System.out.println("Dog always barks bcoz it is his state");
    }
    public static void main(String[] args) {

        Animal a = new Dog();
        a.bark();
        Animal d = new Animal();
        d.bark();
        new MethodOverriding().bark();
    }
}
