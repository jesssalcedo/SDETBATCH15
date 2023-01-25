package groupProject;

public class Task11 {
    /*
    Write a program to print out duplicate elements from an Array of Strings?
     */
    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }

    }
}