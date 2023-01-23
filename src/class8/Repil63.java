package class8;

import java.util.Scanner;

public class Repil63 {

    public static void main(String[] args) {
        Scanner fetch=new Scanner(System.in);
        System.out.print("Please enter number");
        int x=fetch.nextInt();
        for(int i=0; i<x; i++){
            System.out.print(i+" "); // to put on same line with space we must concatenate
        }

    }
}
