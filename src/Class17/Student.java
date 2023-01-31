package Class17;

public class Student {

    String id;

    String name;

    int age;

    double weight;

    Student(String sName, String sID, int sAge, double sWeight){ //constructor
        id=sID;
        name=sName;
        age=sAge;
        weight=sWeight;


    }
    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }

    public static void main(String[] args) {
        Student stu1=new Student("Jessica", "14523664",30,189);
        stu1.printInfo();
    }
}




