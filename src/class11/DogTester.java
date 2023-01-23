package class11;

import java.util.Scanner;

public class DogTester {

    public static void main(String[] args) {

        //Creating an actual object from the class scanner
        Scanner scan = new Scanner(System.in);
        scan.next();

        Dog jacky=new Dog();
        jacky.sleep();
        System.out.println(jacky.age);
    }
}
