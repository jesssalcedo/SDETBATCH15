package class11;

public class CatTester {

    public static void main(String[] args) {

        Cat cat1=new Cat();

        cat1.name="Loki";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Gray";
        cat1.eat();
        cat1.attitude=false;


        Cat cat2=new Cat();

        cat2.name="Loki";
        cat2.breed="Domestic";
        cat2.color="White";
        cat2.age=20;
        cat2.speak();

    }
}
