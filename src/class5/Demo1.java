package class5;

import java.util.Scanner;

public class Demo1 {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Scanner=> Name of the class
        scan is just a variable like we create primitive variable
        = => assignment operator
        System.in => tells the computer we want to read the data from keyboard
         */

//        System.out.println("Please enter your age?");
//        int age= scanner.nextInt();
//        System.out.println("You are "+age+" Years old");
//
//        System.out.println("Please enter your weight?");
//        double weight= scanner.nextDouble();
//        System.out.println(" Your weight is "+weight);
//
//        System.out.println("Are you hungry?");
//        boolean hungry= scanner.nextBoolean();
//        System.out.println("hungry "+hungry); // ctrl+shift+forward slash to

//        System.out.println("Please enter your gender");
//        char gender= scanner.next().charAt(0);
//        System.out.println("Your gender is "+gender); //char type of input

        System.out.println("Please enter your name");
        String Name= scan.next();
        System.out.println("Your name is "+Name);
        scan.nextLine(); // Trick to make nextine method work after we have used any other method from Scanner class
        System.out.println("Please enter your full name");
        String fullName= scan.nextLine();
        System.out.println("My full name is "+fullName);

    }
}