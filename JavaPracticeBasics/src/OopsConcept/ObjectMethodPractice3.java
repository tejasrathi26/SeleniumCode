package OopsConcept;

//ATM Banking Example
class Account{

    String name;
    double accountNumber;
    float amount;

    public void accountInfo(String n,double accNo,float amt){
        name =n;
        accountNumber = accNo;
        amount = amt;
    }

    void display(){
        System.out.println(name+" , "+accountNumber+" , "+amount);
    }

    void withdrawAmount(float amt){
        if(amt > amount){
            System.out.println("Insufficient Amount");
        }
        else{
            amount = amount-amt;
        }
    }

    void depositAmount(float amt){
        amount = amount + amt;
    }

    void checkBalance(){
        System.out.println(amount);
    }

}

public class ObjectMethodPractice3{

    public static void main(String[] args) {
        Account a = new Account();
        a.accountInfo("Tejas",123456,5000);
        a.display();
        a.checkBalance();
        a.depositAmount(44000);
        a.checkBalance();
        a.withdrawAmount(51100);
        a.checkBalance();
        a.withdrawAmount(21300);
        a.checkBalance();
    }
}
