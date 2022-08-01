package Inheritance;

public class Ans{

    public static void main(String[] args) {

        Employee e = new Employee();
        e.name= "Tejraj";
        e.age = 25;
        e.phoneNumber = 12345;
        e.address = "Karad";
        e.salary = 51000;
        e.specialization = "Sr.QA Engineer";
        e.printSalary();

        Manager m = new Manager();
        m.name= "Vijay";
        m.age = 29;
        m.phoneNumber = 54321;
        m.address = "Karad";
        m.salary = 120000;
        m.department = "Quality Assurance";
        m.printSalary();
    }
}
