package Class24;

public class FinalDemo {

    public static void main(String[] args) {

        final int num;// we have created a constant variable
        num=20;
        //num=30; not possible bc the varibale is declared final
    }

   final void noOneShouldOverideIt(){
        System.out.println("This method should never be overridden otherwise it might break the code base");
    }

}
class Nelson extends FinalDemo{

   // @Override
   // void noOneShouldOverideIt() {
     //   System.out.println("Let me do that");
    }

