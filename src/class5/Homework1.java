package class5;

import java.util.Scanner;

public class Homework1 {
    /*
    Prompt the user to enter person heights in inches.
    Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int heightInches=scan.nextInt();
        System.out.println("Your height in inches is "+heightInches);

        if(heightInches>72){
            System.out.println("You're tall");
        }if(heightInches>60||heightInches<72){
            System.out.println("You're medium");
        }else {
            System.out.println("You're short");
        }


    }
}
