package Class16;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment the numberOfStudents for each object
Print out  total number of students

     */

    String name;
    String ID;

    static int numOfStudents;

    public static void main(String[] args) {

        Students stu1=new Students();

        stu1.name="Jessica";
        stu1.ID="123jjs";
        stu1.numOfStudents++;



        Students stu2=new Students();

        stu2.name="Jhon";
        stu2.ID="123Salcedo";
        stu2.numOfStudents++;


        Students stu3=new Students();
        stu3.name="Isabella";
        stu3.ID="745isa";
        stu3.numOfStudents++;

        System.out.println(numOfStudents);

    }
    }
