package Class19;

public class ConstructorChain {

    ConstructorChain(){
        System.out.println("I am non argument constructor");
    }

    ConstructorChain(String str) {

        this(); //making a call to non argument constructor
        System.out.println(str);


    }
    ConstructorChain(String str, int number){
        this(str);
        System.out.println("This is constructor with parameter "+number);
    }

    public static void main(String[] args) {

        ConstructorChain obj=new ConstructorChain("Hello", 0);

        System.out.println("---The end of code ------");
    }
}
