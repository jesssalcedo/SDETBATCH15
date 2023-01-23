package Class4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        You are a loan specialist and you need to ask user
        what is the amount of loan is needed.
        If loan is less or equal to 200,000 then you would
        lend the money otherwise you would reject the client.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the loan needed");

        int amount= scan.nextInt();

        if(amount<=200000){
            System.out.println("I will lend you money");
        }else{
            System.out.println("Your loan application is not approved");
        }
    }
}
