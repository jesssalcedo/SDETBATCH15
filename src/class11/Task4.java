package class11;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {


    /*
   ) Create 2D array of cars :
    american, german, korean, italian.
    Then retrieve all values from that array using 2 different loops
     */

    String [][] car= { {"Toyota", "Ford", "Tesla" },
                        {"Audi","BMW", "Porsche"},
                        {"Kia", "Genesis", "Hyundai"},
                        {"Alfa Romeo", "Fiat", "Ferrari"}};

        for (int i = 0; i < car.length; i++) {
            for (int j = 0; j < car[i].length; j++) {
                System.out.print(car[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println();
        for (String[] typeOfCar:car){
            System.out.println(Arrays.toString(typeOfCar));

        }



    }



}
