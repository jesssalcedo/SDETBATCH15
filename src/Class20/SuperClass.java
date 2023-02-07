package Class20;

public class SuperClass {

    SuperClass(){
        System.out.println("I am an constructor from the parent class");
    }
}

class subClass extends SuperClass{

    subClass(){
        super(); //makes a call to the parent
    }
}
