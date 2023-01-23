package class12;

import java.util.Scanner;

public class Task3 {
    /*
    Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter moms first name");
        String momName=scan.next();
        System.out.println("Please enter dads name");
        String dadName=scan.next();
        System.out.println("Is it a boy or girl");
        String gender=scan.next();
        String suggestedName="";

        if (gender.equals("boy")){
            suggestedName=dadName.substring(0,1)+momName.substring(0,1);
        }else {
            suggestedName=momName.substring(0,1)+dadName.substring(0,1);
        }
        System.out.println("Suggested baby name is "+suggestedName);



    }

}
