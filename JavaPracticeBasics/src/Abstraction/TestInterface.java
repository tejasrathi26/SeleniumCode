package Abstraction;

public class TestInterface{

    public static void main(String[] args) {

     SBIBank s = new SBIBank();
     s.carLoan();
     s.HomeLoan();
     s.personalLoan();
     System.out.println(s.rateOfInterest());

     Bank b = new SBIBank();
     b.HomeLoan();
     b.carLoan();
     System.out.println(Bank.cube(4));

    }
}
