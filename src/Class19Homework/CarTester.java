package Class19Homework;

public class CarTester {

    public static void main(String[] args) {

        Car car1=new Car();
        car1.color="Black";
        car1.model="G wagon";
        car1.year=2021;


        System.out.println("---------");

       Truck truck1=new Truck();
       truck1.modelOfTruck="GMCSierra";
       truck1.gasType="Plus";
        truck1.color="Black";
        truck1.model="Sierra";

        truck1.DisplayInfo();

        RV car3=new RV();
        car3.nameOfRV="The Lotus";
        car3.weightCarry=12000;
        car3.gasType="Plus";
        car1.color="White";




    }
}
