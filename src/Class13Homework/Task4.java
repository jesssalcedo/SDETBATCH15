package Class13Homework;

public class Task4 {
    /*
    ) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever
     */

    public static void main(String[] args) {

        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" ");

        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));


                // String word="This";
                //for (int i = word.length()-1; i >=0 ; i--) {
                //  System.out.print(word.charAt(i));


                /*
                for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");

        }
                 */
            }

            System.out.println();


        }

    }
}