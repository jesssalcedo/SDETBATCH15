package class10;

public class ForEachLoopDemo2 {

    public static void main(String[] args) {

        int[] arr={10, 13, 20, 25, 45, 50};
        //print only the odd numbers from this array with the help of normal for loop

        for (int i = 0; i < arr.length ; i++) {
            //arr[1]=0; // This is how we update a single element in an array
            if(arr[i]%2!=0){
                System.out.println(arr[i]
                );
            }

        }
        //replace all the odd num in this array with the help of a normal loop

        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {

                arr[i]=0;
                System.out.println(arr[i]);

            }

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

        }
    }
