package Project2;

interface Shape {

    /*
     Create an Interface 'Shape' with undefined
    methods as calculateArea and
    calculate Perimiter. Create 2 classes Circle &
    Square that implements functionality defined in
    the Shape Interface. Test your code.
    */

    double calculateArea(double x, double y);

    double calculatePerimeter(double a, double b, double c);


}

class Circle implements Shape{

    @Override
    public double calculateArea(double x, double y) {
        return 3.14*x*x;
    }

    @Override
    public double calculatePerimeter(double a, double b, double c) {
        return 3.14*a*2;
    }
}
class Square implements Shape{

    @Override
    public double calculateArea(double x, double y) {
        return x*x;
    }

    @Override
    public double calculatePerimeter(double a, double b, double c) {
        return ((a)*4);
    }
}
