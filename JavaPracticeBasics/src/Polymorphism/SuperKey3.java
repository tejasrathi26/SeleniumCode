package Polymorphism;

class Animal4{

    void message(){
        System.out.println("Parent class Method");
    }
}

class Dog4 extends Animal4{

    void message(){
        System.out.println("This is child class Method");
    }

    void message2(){
        System.out.println("This is child class message 2");
    }

    void work(){
        super.message();
        message2();
    }
}

public class SuperKey3{

    public static void main(String[] args) {

        Dog4 a = new Dog4();
        a.work();
    }
}
