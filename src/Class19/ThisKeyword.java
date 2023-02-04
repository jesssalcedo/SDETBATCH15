package Class19;

public class ThisKeyword {

    int a,b; //instance variables

    ThisKeyword(int a, int b){
        this.a=a;
        this.b=b;
    }

    //create a method

    public void sum(int a, int b){ //local variables
        System.out.println("Sum of local variables = "+(a+b));
        System.out.println("Sum of instance variables = "+(this.a+this.b));
    }

    void hello(){
        System.out.println("Hello batch 15");
    }

    void howAreYou(){
        System.out.println("How are you batch 15?");
    }

    void greetings(){
        hello();
        howAreYou();
    }

    public static void main(String[] args) {

       ThisKeyword obj=new ThisKeyword(12,14);
        obj.sum(100,200);

        // -------------------------------------------

        obj.greetings();

    }
}
