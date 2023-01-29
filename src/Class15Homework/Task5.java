package Class15Homework;

public class Task5 {
    /*
    Write a method to return whether given number is prime or not
     */

    boolean primeNum(int num1) {
        if (num1 > 1) {
            for (int i = 2; i <= num1/2; i++) {
                if (num1 % i == 0) {
                    return false;

                }

            }


        }else {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {


        Task5 prime = new Task5();
        System.out.println(prime.primeNum(5));

    }
}

