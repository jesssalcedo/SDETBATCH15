package class12;

import java.util.Locale;

public class StringDemo2 {

    public static void main(String[] args) {

        // only converts the upper cse letters to lowercase

        String str="Java is FUN 11335@$%";
        String newStr= str.toLowerCase();
        System.out.println(newStr);

        String str2=" i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);
    }
}
