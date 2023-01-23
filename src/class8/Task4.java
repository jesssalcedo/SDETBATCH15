package class8;

import java.util.Scanner;

public class Task4 {
    /*
    Write a program to ask a user to enter
    item they want to buy and the price of that item.
    Every time user enters money accumulate the price
    and tell the user how much is total left to pay off.
    If user give more money program should return a change.
    Whenever a user done with payments program should say "Thank you for shopping!"

    step1: ask user for item price and item name
    step2: accumulate the price
    3.tell the user how much total that they have to pay
    4: If user gives more money program should return a change
    5. Thank you for shopping
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total=0;
        for (int i = 0; i < 3; i++) {



            System.out.println("Please enter the item and its price");
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            total=total+itemPrice;
            System.out.println("This is the total amount that you have to pay "+total);

        }

        System.out.println("Please pay for the items");
        double amountPaid= scan.nextDouble();

        if (amountPaid>total){
            double change=amountPaid-total;
            System.out.println("Here is your change "+change);
        }
        System.out.println("Thank you for shopping");

    }


}
