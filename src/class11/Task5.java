package class11;

import java.util.Arrays;

public class Task5 {
    /*
    Using 2D array create a grocery list.
Inside you should have an array of veggies,
 fruits, dairy and sweets. Retrieve all values
 from that array using 2 different loops
     */

    public static void main(String[] args) {
        String[][] groceryList={{"Carrots","Celery","Cucumber"},
                                {"Apple","Banana","Strawberry"},
                                {"Milk","Cheese","Creamer"},
                                {"Cookies","Muffins", "Cupcakes"}};

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length ; j++) {
                System.out.print(groceryList[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        for (String[] List:groceryList){
            System.out.println(Arrays.toString(List));
        }

    }
}
