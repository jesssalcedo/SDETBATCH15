package class9;

public class Task1 {

    public static void main(String[] args) {
        /*
        Create an array of chars and store grades into it: A,B,C,D,E,F.
         Then print a grade B (use 2 different ways of creating an array).
         */
        char[] grades={'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < grades.length; i++) {
            if(grades[i]=='B'){
                System.out.println(grades[i]);
            }

        }

        System.out.println("****************");

        char[] grades2=new char[6];

        grades2[0]='A';
        grades2[1]='B';
        grades2[2]='C';
        grades2[3]='D';
        grades2[4]='E';
        grades2[5]='F';

        for (int i = 0; i < grades2.length; i++) {
            if (grades2[i]=='B'){
                System.out.println(grades2[i]);
            }

        }



    }
}