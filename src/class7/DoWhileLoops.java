package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        do {
            System.out.println("Please enter a number");
            num=scan.nextInt();
        }while (num!=5);

        int num2=5;

        while (num2!=5){
            System.out.println("Please enter a number : ");
            num2=scan.nextInt();
        }
    }
}
