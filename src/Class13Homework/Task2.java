package Class13Homework;

public class Task2 {
    /*
    // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
     */
    public static void main(String[] args) {


        String str = "ASDAEDESDFSDFasdad4524^$%^$^";

        System.out.println(str.replace("^A-Za-z0-9","").length()); // method changing
    }
}