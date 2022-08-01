package OopsConcept;

public class Student {

    int rollNo;
    String name;
    static String college = "ITI";

    static void change() {
        college = "IITians";
    }

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

  static {
      System.out.println("Static Block");
  }
}
