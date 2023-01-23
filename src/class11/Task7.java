package class11;

public class Task7 {
    /*
    Create a 2D array or integer type
    where you will store odd and even numbers in 3 rows and 4 columns.
    Develop a program which will identify/print the even numbers only.
     */

    public static void main(String[] args) {
        int[][] num= { {1, 55, 78, 100},
                       {22, 31, 50, 74 },
                       {40, 27, 33, 42}};

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                if (num[i][j]%2==0){
                    System.out.println(num[i][j]+" ");
                }

            }

        }

        }


    }

