import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {


        boolean condition=true;
        Scanner scan=new Scanner(System.in);
        int number=10;
        while (condition){
            System.out.println("Please enter a number between 10 to 20");
            int userInput=scan.nextInt();
            if(userInput>number){
                System.out.println("You enter number is greater");
            } else if (userInput<number) {
                System.out.println("You entered a smaller number");

            }else {
                System.out.println("You won!!!!!");
                condition=false;
            }
        }
    }
}
