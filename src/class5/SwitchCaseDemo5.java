package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender M/m/F/f");


        char gender=scan.next().charAt(0);

        switch (gender){
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Poor Males");
                break;
            default:
                System.out.println("Not specified");
        }
    }
}
