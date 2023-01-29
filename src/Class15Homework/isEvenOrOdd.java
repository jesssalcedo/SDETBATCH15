package Class15Homework;

public class isEvenOrOdd {
     /*
    Create a method that will take a number and prints whether the number is even or odd.
     */

    String number(int num1) {
        if (num1 % 2 == 0) {
            return "This is an even number";
        } else {
            return "This is an odd number";
        }
    }

    public static void main(String[] args) {


        isEvenOrOdd num = new isEvenOrOdd();

        System.out.println(num.number(16));






    }

}
