package class9;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        //String[] names={"Jessica", "Jason", "Jelena ","Hasmik", "Nafisa", "Adem"}; 1st way to create array

        String [] names= new String [6];
        names[0]="Jessica";
        names[1]="Jason";
        names[2]="Jelena";
        names[3]="Hasmik";
        names[4]="Nafisa";
        names[5]="Adem";


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
