package Class23;

public class FinalKeyword {

    double gravity=9.8;

    double PI=3.14;

    double LightSpeed=29957512;

    final void tryChangingGravity(){
        //gravity 1.6;// we get an error bc this variable is marked
    }
}
class Child extends FinalKeyword{
   // void tryChangingGravity (){ when adding final in parent class can NOT be inherited in child class

    }
