package Class2;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        /*
        Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
        Your program should say.
        “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
        The perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0
         */

        double width=5;
        double height=8;

        System.out.println("The perimeter of a rectangle with the width 5 and height 8 is equal to "+ (2*height + 2*width) +
                " and the area is "+ (height * width));
    }
}