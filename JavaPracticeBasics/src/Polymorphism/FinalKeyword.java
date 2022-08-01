package Polymorphism;

class car{

    final int speedlimit;

    car(){
        speedlimit=400;
        System.out.println(speedlimit);
    }

}
public class FinalKeyword extends car{

    public static void main(String[] args) {

        car c = new FinalKeyword();
    }
}
