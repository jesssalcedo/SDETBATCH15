package Class24;

public class Animal {

    void speak(){
        System.out.println("Animal sounds");
    }
    void eat(){
        System.out.println("Animal eat");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    void speak() {
        System.out.println("woof woof");
    }
}
class Cat extends Animal{

    @Override
    void speak() {
        System.out.println("meow");

    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
class Cow extends Animal{

    @Override
    void eat() {
        System.out.println("Cow is eating");
    }

    @Override
    void speak() {
        System.out.println("moooooooo");
    }
}