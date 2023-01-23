package class8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task3 {
    /*
    Write a program that reads a range of integers
    (start and end point), provided by a user and then
    from that range prints the sum of the even and odd integers.

    //we need to declare variables bc it was the sum

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 numbers starting point and ending point");
        int start=scan.nextInt();
        int end=scan.nextInt();
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <=end ; i++) {

            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum=oddSum+i;
            }

        }
        System.out.println("Sum of all the even Number is "+evenSum);
        System.out.println("The sum of all the odd number is "+oddSum);
    }




}
