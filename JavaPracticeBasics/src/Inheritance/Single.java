package Inheritance;
class Area{
    int length = 5;
    int breadth = 7;

}
public class Single extends Area{

    void areaRectangle(){
        System.out.println(length*breadth);
    }
    public static void main(String[] args) {

        Single s = new Single();
        s.areaRectangle();

    }
}
