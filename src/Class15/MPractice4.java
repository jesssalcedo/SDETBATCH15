package Class15;

public class MPractice4 {
    /*
    Create a method that takes two numbers as parameters and return the larger number
     */

    int returnLarger(int a, int b) { //method header
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.returnLarger(12,13));
    }

}
