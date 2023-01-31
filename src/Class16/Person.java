package Class16;

public class Person {

    private double bankBalance=1250000;

    String address="Street 123"; // default access level is applied

    String name="Jessica Salcedo";

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
    }
}
