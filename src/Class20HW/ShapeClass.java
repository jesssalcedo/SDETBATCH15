package Class20HW;

public class ShapeClass {
    double radius;

    ShapeClass(double radius){
        this.radius=radius;



    }
}
class Circle extends ShapeClass{
    double pie=3.14;
    Circle(double radius){
        super(radius);
    }
    void area(){
        System.out.println("The area of the cirle is "+pie*(radius*radius));
    }
}
