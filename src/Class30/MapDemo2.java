package Class30;

import java.util.HashMap;

public class MapDemo2 {

    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();

        fruit.put("Apple", 1.99);
        fruit.put("Orange", 2.99);
        fruit.put("Banana",4.99);
        fruit.put("Kiwi", 0.99);
        fruit.put("Apple",3.99);
        fruit.put(null,null);
        System.out.println(fruit);


    }
}
