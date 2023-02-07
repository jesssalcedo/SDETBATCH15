package Class20;

public class Sport {

    String name;
    String country;

    Sport(String name, String country){
        this.name=name;
        this.country=country;
    }

    public  void display(){
        System.out.println(name+" is played in "+country);
    }
}

class Cricket extends Sport{

    String helmet;

    Cricket(String helmet, String country, String name){
        super(name, country);
        this.helmet=helmet;
    }
}




