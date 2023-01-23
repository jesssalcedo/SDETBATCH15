package Class2;

public class MathWithDecimals {
    public static void main(String[] args) {
        /*
        Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The __ of 2 numbers __ and  is equal to __”
Expected Output:
The Addition of 2 numbers 10.5 and 10.5 is equal to 21.0
The Subtraction of 2 numbers 10.5 and 10.5 is equal to 0.0
The Multiplication of 2 numbers 10.5 and 10.5 is equal to 110.25
The Division of 2 numbers 10.5 and 10.5 is equal to 1.0
Write a program to find the square of the number 3.9. You program should say “The square of the  is  “
Expected output:

The square of the 3.9 is 15.209999999999999
         */

        double x=5.5;
        double y=20.5;

        System.out.println("The Addition of 2 numbers "+ x + " and "+ y + " is equal to "+ (x+y));
        System.out.println("The Subtraction of 2 numbers "+ x + " and "+ y + " is equal to "+ (x-y));
        System.out.println("The Division of 2 numbers "+ x + " and "+ y + " is equal to "+ (x/y));
        System.out.println("The multiplication of 2 numbers "+ x + " and "+ y + " is equal to "+ (x*y));

        //Write a program to find the square of the number 3.9. You program should say “The square of the  is  “
        //Expected output:
        //
        //The square of the 3.9 is 15.209999999999999

        double c =3.9;
        double square=c*c;

        System.out.println("The square of "+ c +" is "+ square);



    }
}
