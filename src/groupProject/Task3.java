package groupProject;

public class Task3 {
    /*
    Create a 2D array of integer values. Print the sum of all numbers.
     */
    public static void main(String[] args) {


        int sum = 0;
        int[][] num = {{1, 2, 3, 4},
                       {7, 8, 9, 10},
                       {7, 8, 9, 10},
                        {7, 8, 9, 10}};



        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++) {
                sum=sum+ num[i][j];

            }

        } System.out.println(" "+sum);



        }


    }

