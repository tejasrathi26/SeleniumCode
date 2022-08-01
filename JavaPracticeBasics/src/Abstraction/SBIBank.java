package Abstraction;

public class SBIBank extends TestAbstract{

    @Override
    public double rateOfInterest() {
        return 8;
    }

    @Override
    public void personalLoan() {
        System.out.println("This is personal loan section of SBI");
    }

    @Override
    public void carLoan() {
        System.out.println("This is car loan section of SBI");
    }
}
