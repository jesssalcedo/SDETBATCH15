package Class27;

import java.util.ArrayList;

public class Demo7 {

    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        names.add("Savo");
        names.add("Sam");
        names.add("Jessica");
        names.add("Lesli");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Sam");
        System.out.println(names);
        names.set(3, "Sam");
        System.out.println(names);
        System.out.println(names.indexOf("Savo"));
    }
}