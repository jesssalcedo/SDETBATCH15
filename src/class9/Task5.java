package class9;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create an array of size 5 on integers and calculate the sum of all elements in an array.
         */

        int[] num={1,2,3,4,5};
        int sum=0;
        for (int i = 0; i < num.length ; i++) {
            sum=sum+num[i];


        }System.out.println("The sum is "+sum);
    }

}
