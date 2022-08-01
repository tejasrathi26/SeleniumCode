package OopsConcept;

//Area of Rectangle using Pass by reference method.

public class ObjectMethodPractice2{

    public static void main(String[] args) {

        AreaRectangle s = new AreaRectangle();
        s.length=4;
        s.breadth=8;
        System.out.println(s.length*s.breadth);
    }
}

class AreaRectangle{

    int length,breadth;
}
