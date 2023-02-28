package Class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo4 {

    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(20);
        numbers.add(50);
        System.out.println(numbers);

        // write some logic to remove duplicates from above list

        LinkedHashSet<Integer> uniqueNumbers= new LinkedHashSet<>();
        System.out.println(uniqueNumbers);

    }
}
