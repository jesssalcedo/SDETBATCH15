package Class16;

public class Task3ReviewHW {

    /*
    Create a method that will print whether given String is palindrome or not.
    return type=> void
    name=> isPalindrome
    parameters=> String inputStr

    create logic
    {
    }
    example dad => dad true
    abc=cba false
    */
    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+ "Is palindrome");
        }else{
        System.out.println(str+" not palindrome");
    }


}

    public static void main(String[] args) {
        Task3ReviewHW task3=new Task3ReviewHW();
        task3.isPalindrome("Jessica");
    }

}