package Class25;

interface Washable {

    void wash();
}

class SmartWatch implements Washable{

    @Override
    public void wash() {
        System.out.println("You can wash this smartwatch with out any issues");
    }
}

class Phone implements Washable{

    public   void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }

}

class Inverter implements Washable{
    public void wash(){
        System.out.println("I am IP65 Rated you can wash me");
    }
}
