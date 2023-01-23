package groupProject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    /*
    Using Scanner create an array of integer values.
    After the array is created, calculate the sum of all stored elements in that array.


     */

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int numOfArray=scan.nextInt();
        System.out.println("Please enter the elements of the array one by one");

        int myArray[]=new int[numOfArray];
        int sum=0;

        for (int i = 0; i < numOfArray; i++) {
            myArray[i]=scan.nextInt();
            sum=sum+myArray[i];

        }
        System.out.println("Elements of the array are "+ Arrays.toString(myArray));
        System.out.println("The sum of all elements is " +sum);
    }
}
