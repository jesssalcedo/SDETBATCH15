package Class4;

public class Task2 {

    public static void main(String[] args) {


    /*
    Create a Java program and store values of mortgage rate and mortgage price.
 First, program should check if rate is higher than 4.5 user will not buy a house,
 otherwise user will consider buying. Once user decides to buy a house,
 if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.

     */

    double mortgageRate=4.0;
    int mortgagePrice=250000;

    if(mortgageRate<4.5){
        System.out.println("I will consider buying house");
        if(mortgagePrice>20000){
            System.out.println("I will take out loan");
        }else{
            System.out.println("I will pay cash");
        }
    }else{
        System.out.println("I will not buy house");
    }



    }


    }

