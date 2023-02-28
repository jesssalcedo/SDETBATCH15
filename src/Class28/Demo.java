package Class28;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        for (String s:words) {

            if(s.endsWith("a")){
                words.remove(s);
            }
        }

    }
}