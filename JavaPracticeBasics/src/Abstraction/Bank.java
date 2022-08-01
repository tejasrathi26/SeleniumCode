package Abstraction;

public interface Bank{

    double rateOfInterest();

    public void personalLoan();

    public void carLoan();

    public void HomeLoan();

    default void interest(){
        System.out.println("dt");
    }

    private void testing(){
        System.out.println("rear");
    }

    static int cube(int x){
        return x*x*x;
    }
}
