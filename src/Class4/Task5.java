package Class4;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please input City?");
        String city= scan.next();

        System.out.println("Please enter temperature?");
        int tempF= scan.nextInt();

        double tempC=(tempF-32)*.5556;
        System.out.println("The temperature in the city " + city + " is " +tempC+ " Celcius");




    }
}
