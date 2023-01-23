package class5;

import java.util.Scanner;

public class Homework5 {
    /*Write a program to find largest of three double
     values using if-else..if and logical operators
     provided by a user (numbers must be distinct)
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 double values, it must be a distinct number");
        double num1= scan.nextDouble();
        double num2=scan.nextDouble();
        double num3= scan.nextDouble();

        if(num1>num2&&num1>num3){
            System.out.println("The largest number is "+num1);
        }else if (num2>num1&&num2>num3){
            System.out.println("The largest number is "+num2);
        }else if (num3>num1&&num3>num2){
            System.out.println("The largest number is "+num3);
        }else {
            System.out.println("Invalid input");
        }

    }
}
