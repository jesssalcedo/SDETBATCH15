package class11;

import java.util.Arrays;

public class Task8 {
    /*
    Create 2D array of countries:
     north america countries, south america countries,
     europe countries, asian countries, african countries.
     Then print all values from that array using 2 different loops
      and calculate how many total countries been stored

     */

    public static void main(String[] args) {



    String[][] countries={{"United States","Mexico","Canada"},
                          {"Venezuela", "Bolivia", "Peru"},
                          {"Albania", "Austria", "Croatia"},
                          {"Thailand", "Japan", "Indonesia"},
                          {"Nigeria", "Kenya", "Ghana"}};

int count=0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                count++;
                System.out.print(countries[i][j]+" ");


            }
            System.out.println();

        }
        for (String[] name:countries){
            System.out.println(Arrays.toString(name));
        }
        System.out.println("The total number of countries in 2d array is "+count);


    }
}
