package Class28;

import java.util.LinkedList;

public class LinkedListDemo3 {


    public static void main(String[] args) {

        //LinkedList= 160 millaseconds

        long startTime =System.currentTimeMillis();
        LinkedList<String> numbers = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            numbers.add(0, "Test Data");

        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);



    }
}
