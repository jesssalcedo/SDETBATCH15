package class9;

public class ArrayDemo6 {

    //create an empty array then store 45, 44, 33, 20 and 10 in it use a loop
    //to add all the element which are present in even indexes and print it after adding them

    /*
    Task 2: create an array and store 10 20 300 4 5 6 7 80
    add all the elements which are multiple of 2
     */

    public static void main(String[] args) {



        int sum=0;
        int[] numbers = new int[5];
        numbers[0] = 45; //
        numbers[1] = 44;
        numbers[2] = 33;//
        numbers[3] = 20;
        numbers[4] = 10;//

        for (int i = 0; i <numbers.length ; i++) {
            if (i%2==0){
                sum=sum+numbers[i];

            }

        }
        System.out.println("The sum of even numbers is "+sum);


    }

}
