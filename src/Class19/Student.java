package Class19;

public class Student {

    String name;

    String address;

    void displayInfo(){
        System.out.println(this.name+this.address);
    }

    Student(String name, String address){
        this.name=name;
        this.address=address;
    }
}
