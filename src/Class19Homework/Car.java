package Class19Homework;

public class Car {

    String color;
    int year;
    String model;

    void printInfo() {
        System.out.println("The color of the car is " + color + " The year of the car is " + year + " The model of the car is " + model);
    }

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

