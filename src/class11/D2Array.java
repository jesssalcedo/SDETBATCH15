package class11;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class D2Array {

    public static void main(String[] args) {

            int[][] matrix={{10,20,30},
                            {45,55,66},
                            {0,40,20,10,25 }

            };

        System.out.println(matrix[2][4]); // down - right
        System.out.println(Arrays.toString(matrix[0]));

        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][i]);

        }

        int[] arr=matrix[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
