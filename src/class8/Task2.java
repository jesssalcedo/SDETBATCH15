package class8;

import java.util.Scanner;

public class Task2 {
    /*
    Create a program that will be asking user to apply
    for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < 10; i++) {


            System.out.println("Do you want to apply for credit card");
            String userResponse = scan.next();
            if (userResponse.equalsIgnoreCase("yes")) {
                break;
            }


        }
        }



    }



