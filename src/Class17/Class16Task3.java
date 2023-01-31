package Class17;

public class Class16Task3 {

    public static void main(String[] args) {
        /*
        /*    Create a method that will accept a String as a parameter
and return a new String that consist only of vowels.
Method should be available inside the class only
where it was declared and executed by calling it is name.
         */


        System.out.println(getOnlyVowels("Java"));

    }
      private static String getOnlyVowels(String inputStr){
            //AEIOY
            //Ashgar =>A
            return inputStr.replaceAll("[^AEIOUYaeiou]",""); //^return whats in the quotation
        }

}
