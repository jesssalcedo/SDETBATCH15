package class11;

public class Task6 {
    /*
    Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

     */

    public static void main(String[] args) {
        int[][] num={{1, 2, 3},
                    {7, 8,  9},
                    {10, 25, 90}};
        int sum=0;

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum= sum+num[i][j];


            }

        }
        System.out.println("The Sum of all numbers is "+sum);

    }
}
