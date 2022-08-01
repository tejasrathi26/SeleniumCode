public class javaMethodDemo{

    public static void main(String[] args) {

        javaMethodDemo d = new javaMethodDemo();
        String name = d.getData();
        System.out.println(name);
        javaMethodDemo2 d2 = new javaMethodDemo2();
        d2.getUserData();
        System.out.println(getData1());
    }

    static{
        System.out.println("Static block invoked");
    }

    public String getData()
    {
     System.out.println("Hello World");
     return "Learning Selenium with java";
    }

    public static String getData1()
    {
        System.out.println("Hello World11");
        return "Learning Selenium with java11";
    }
}
