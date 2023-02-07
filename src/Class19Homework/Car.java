package Class19Homework;

public class Car {

    String color;
    int year;
    String model;



}
    class Truck extends Car {

        String gasType;
        String modelOfTruck;

        void DisplayInfo() {
            System.out.println(gasType + modelOfTruck);

        }

    }


        class RV extends Truck {

            String nameOfRV;
            int weightCarry;

            void RVinfo() {
                System.out.println(nameOfRV + weightCarry);
            }

    }

