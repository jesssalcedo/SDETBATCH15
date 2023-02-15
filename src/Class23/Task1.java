package Class23;

import Class21.Calculator;

public class Task1 {


    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
    // interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.


    /*
    String
    Scanner
    StringBuffer
    Math
     */


}

class CreditCard {
    double balance;

    double interest;

    CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest; // constructors dont participate in inheritance
    }

    public void calculateInterest() {
        System.out.println("Interest " + (balance * interest)/100);
    }

}

class Visa extends CreditCard{

    public Visa(double balance, double interest){
        super(balance,interest);
    }

class AX extends CreditCard{
        AX(double balance, double interest){
            super(balance,interest);
        }
}

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,10);
        creditCard.calculateInterest(); //calling method with the help of object
    }


}
