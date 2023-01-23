package class9;

public class ArrayDemo6Task2 {

    public static void main(String[] args) {
         /*
    Task 2: create an array and store 10 20 300 4 5 6 7 80
    add all the elements which are multiple of 2
     */

        int[] number={10,20,30,4,5,6,7,80};
        int sum=0;
        for (int i = 0; i <number.length ; i++) {
            if(number[i]%2==0){
                sum=sum+number[i];
            }
        }
        System.out.println(sum);

    }


}