package OopsConcept;

public class StaticMethodVariableExample{

    static{
        System.out.println("Static method executes before main method ");
    }

    public static void main(String[] args) {

        Student s1 = new Student(1,"Tejas");
        Student s2 = new Student(2,"Rathi");

        s1.display();
        Student.change();

        s1.display();
        s2.display();

    }



}
