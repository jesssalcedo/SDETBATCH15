package class5;

import java.util.Scanner;

public class Homework6 {
    /*
    Write a program to find largest number
    among three numbers using nested if provided by a user (numbers must be distinct)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 digits and they must be distinct");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is " + num3);
        }
    }
}
