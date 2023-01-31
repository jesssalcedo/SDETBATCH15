package Class16;

import class12.Computer;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects

     */

    int empID; // instance variable
    int salary; // instance variable
    static String ceo="Sumair"; // is going to be same bc we create this one as a static



    public static void main(String[] args) {
        SyntaxEmployee employee1=new SyntaxEmployee();

        employee1.empID=987654321;
        employee1.salary=100000;
        System.out.println(employee1.salary+" "+employee1.empID+" "+employee1.ceo);

        SyntaxEmployee employee2=new SyntaxEmployee();

        employee2.empID=246810121;
        employee2.salary=125000;
        System.out.println(employee2.salary+" "+employee2.empID+" "+employee2.ceo);



    }
}
