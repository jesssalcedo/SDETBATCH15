package Class2;

public class VariablesFirstClass {
    public static void main(String[] args) {
        /*
        Below Line is reserving a line in the computer memory.
        we are calling it box 1 and if we need the information that we are storing inside this box
        we can simply say to the computer to give us the contents of box1.
        int=> what type of date we want to store
        box1=> is the make of the box
        = sign will take what ever we right after it and will store it inside the box
        10=> is what we are storing inside box
       */
        int box1=10;
        // if we are printing something from a box we dont need ""

        System.out.println(box1); // bring the contents of box1 and print them on the console
        /*To store whole numbers (numbers without decimal ) we have 4 different types of boxes
        for example numbers like 10 20 30 50000 100000
        1) byte 2) short 3) int 4) long
         */
        byte box2=127;  //range for byte is from -128 to 127 if we
        // need to store larger numbers we should try short
        byte box3=-128;
        short box=32767;
        int biggerBox= 123456789; // most common type of box
        long maxBox= 123456789123456l;


        short myBox=10000;
        System.out.println(myBox);


    }

}

