package class5;

import java.util.Scanner;

public class Homework7 {
    /*
    Ask user to enter their country and capture it.
    Once values are captured print which language user speaks.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter what country you are from?");
        String country=scan.next();
        String language;

        switch (country){

            case "Venezuela":
                language="Spanish";
                break;
            case "United States":
                language="English";
                break;
            case "China":
                language="Chinese";
                break;
            case "France":
                language="French";
                break;
            default:
                language="Invalid input";
        }
        System.out.println("You are from "+country+ " and you speak "+language);
    }
}
