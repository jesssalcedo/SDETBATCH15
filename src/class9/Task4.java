package class9;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an array that can store names of cars and
        store 6 elements into it. Print all values from the array.
         */

        String[] carNames={"BMW", "Honda", "Toyota", "Mercedes Benz", "Range rover", "Tesla"};

        for (int i = 0; i < carNames.length ; i++) {
            System.out.println(carNames[i]);

        }
    }
}
