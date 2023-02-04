package Class19;

public class BankAccount { //Parent Class or super class or base class

    long accountNumber;
    double money;


    void deposit(){
        System.out.println("Deposit made from Bank account");
    }
}

class Checking extends BankAccount { // Checking class is child class or sub class or derived class

    double interest;

    void transfer() {
        System.out.println("Transfer methods from Checking accout");
    }
}

    class Savings extends BankAccount {

        double profit;

        void takeProfit() {
            System.out.println("Profit methid from saving class");

        }
    }
