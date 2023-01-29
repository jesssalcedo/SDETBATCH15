package Class15Homework;

public class Palindrome {

  /*
    Create a method that will print whether given String is palindrome or not
     */

    boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Palindrome word=new Palindrome();
        System.out.println(word.isPalindrome("mom"));
    }
}
