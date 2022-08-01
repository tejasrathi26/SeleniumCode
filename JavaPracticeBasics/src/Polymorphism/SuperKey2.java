package Polymorphism;
//Super is also used to invoke immediate parent class constructor

class Animal3{

    Animal3(int l,int b){
        System.out.println("This is parent class");
        System.out.println("Area is ="+l*b);
    }
}

class Dog3 extends Animal3{

    Dog3(){
        super(5,7);
        System.out.println("This is child class");
    }
}

public class SuperKey2{

    public static void main(String[] args) {
        Dog3 a = new Dog3();
    }
}
