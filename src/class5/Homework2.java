package class5;

import java.util.Scanner;

public class Homework2 {

    /*
    2) Write a program that will print whether it is a weekend or weekday.
    If any day from 1-5 → output “It is a weekday”,
     anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter day number?");
        int day=scan.nextInt();


        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

}
