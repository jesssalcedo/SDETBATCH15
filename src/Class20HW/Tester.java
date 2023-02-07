package Class20HW;

import Class19Homework.Teacher;

public class Tester extends FullTime {

    String bonus;

    Tester(String name, int employeeID, String jobTitle, String benefits, String bonus) {
        super(name, employeeID, jobTitle, benefits);
        this.bonus = bonus;

    }

    void printBonus() {
        System.out.println("All employees will receive bonus");


    }

    public static void main(String[] args) {


        EmployeeClass e1 = new EmployeeClass("Jessica", 12345678, "Front desk");
        e1.printInfo();

        FullTime e2=new FullTime("Jhon", 1234567, "dental assistant","health insurance");
        e2.printInfo();
        e2.display();


        PartTime e3=new PartTime("Isabella", 9876541, "hygenist",20);
        e3.printInfo();
        e3.hours();

        Tester e4=new Tester("Adrianno",8754785, "Manager","2 week vacation","1000");
        e4.printInfo();
        e4.display();
        e4.printBonus();
    }
}