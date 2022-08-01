package Abstraction;

abstract class shape{

    String color;
    abstract double area();

    public String getColor(){
        return color;
    }

    shape(String color){
        System.out.println("Shape Constructor called");
        this.color = color;
    }

    public abstract String toString();
}

class rectangle extends shape{

    double length;
    double breadth;

    rectangle(String color,int length, int breadth){
       super(color);
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double area() {
        return length*breadth;
    }

    public String toString(){
       return "Area of Rectangle is = "+area()+ " and Color is = "+getColor();
    }
}

class circle extends shape{

    double radius;

    circle(String color,double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    double area(){
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "Area of Circle is = "+area()+ " and Color is = "+getColor();
    }
}

public class Example1{

    public static void main(String[] args) {

        shape s = new rectangle("Blue",5,7);
        shape s1 = new circle("red",4.2);

        System.out.println(s.toString());
        System.out.println(s1.toString());
    }
}
