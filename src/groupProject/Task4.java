package groupProject;

public class Task4 {

    /*
     Create a 2D array or integer type where you will store odd and even numbers.
     Develop a program which will identify/print the even numbers only.
     */

    public static void main(String[] args) {


        int[][] numbers = {{1, 2, 3, 4},
                {11, 12, 13, 14}};


        int even= 0;
        int odd= 0;

        for(int i=0; i<numbers.length; i++) {  // numbers.length tells us how many total rows are present in 2D Array
            for (int j = 0; j < numbers[i].length; j++) {   // numbers[i].length will give the size of each 1D Array
                if (numbers[i][j] % 2 == 0) {
                    even = numbers[i][j];
                    System.out.println("Even Numbers: " + even);
                }
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 != 0) {
                    odd= numbers[i][j];
                    System.out.println("Odd Number: " + numbers[i][j]);
                }
            }
        }





    }
}
