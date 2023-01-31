package Class17;

public class Class16Task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name
     */

    public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();


    }
}
