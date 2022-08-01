package OopsConcept;

/* To Print Area of Rectangle using object and methods Initializing By Method*/

public class ObjectMethodPractice {

    public static void main(String[] args) {

        // Object of class created using new keyword
        Rectangle  a = new Rectangle();
        a.getAreaRectangle(5,6);
        a.display();
        Student s=new Student(8,"Tejraj");
        s.display();
    }
}
    class Rectangle {

        int length, breadth;
        void getAreaRectangle(int l, int b) {
            length = l;
            breadth = b;
        }

        void display() {
            System.out.println(length * breadth);
        }
    }