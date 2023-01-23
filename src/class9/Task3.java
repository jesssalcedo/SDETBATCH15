package class9;

public class Task3 {
    public static void main(String[] args) {
        /*
         Create an array of words: Java, Saturday, day, coding, is.
         Print the following sentence using elements of array: “Saturday is Java coding Day”.
         */

        String[] days={"Saturday", "is", "Java", "coding", "day"};

        for (int i = 0; i < days.length ; i++) {
            System.out.print(days[i]+" ");

        }
    }
}
