package OopsConcept;


public class ConstructorExample{

    int num1;
    String name;

    ConstructorExample(){
        System.out.println("Default Constructor");
    }

    ConstructorExample(String n, int b){
        num1 = b;
        name = n;
    }
    void display(){
        System.out.println(num1+" "+name);
    }

    public int cube(int n1,int n2,int n3){
        return n1*n2*n3;
    }

    public static void main(String[] args) {

        ConstructorExample c= new ConstructorExample("Tejas",7);
        ConstructorExample c1 = new ConstructorExample();
        System.out.println(c1.cube(4,2,3));
        c.display();
    }
}
