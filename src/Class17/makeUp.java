package Class17;

public class makeUp {

    String brandFoundation;

    String typeOfMakeUp;

    String color;

    double price;


    makeUp(String strBrandFounation, String strTypeOfmakeUp, String strColor, double strPrice){
        brandFoundation=strBrandFounation;
        typeOfMakeUp=strTypeOfmakeUp;
        color=strColor;
        price=strPrice;

    }

    void PrintInfo(){
        System.out.println(brandFoundation+" "+typeOfMakeUp+" "+color+" "+price);
    }

    makeUp(){

    }

}
