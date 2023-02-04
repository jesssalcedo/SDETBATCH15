package Class19;

public class test {

    public static void main(String[] args) {


        BankAccount ba = new BankAccount();
        ba.accountNumber=123456789;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("--Creating an object");

        Checking check=new Checking();
        //features from parent
        check.accountNumber= 5764;
        check.money=4587;
        //features from checking class itself
        check.interest=0;
        check.deposit(); //from parent
        check.transfer(); //from child

        System.out.println("---Creating an object of Saving --------");

        Savings save=new Savings();
        save.accountNumber=12585;
        save.money=7854;
        save.profit=100;

        //save.interest = 0; sibling features are NOT available

        save.deposit(); /// from parent
        save.takeProfit();
        //save.transfer(); NOT AVAILABLE BC SIBLING CLASS



    }




}