package Class28;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BoxingDemo {

    public static void main(String[] args) {

        Integer integer=new Integer(10);
        int number=integer; // its auto UN boxing. It is taking the value of the class and storing it as a primitive data type
        int number2=integer.intValue(); // unboxing longer way

        double d=12.3;
        Double wrapperD=new Double(d); // boxing longer way
        Double wrapperP=d; // autoboxing

        Float f=12f;
        ArrayList<Float> arrayList=new ArrayList<>();
        arrayList.add(12.0f);

        double fg=2f;

    }
}
