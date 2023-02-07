package Class20HW;

import Class20.Parent;

public class EmployeeClass {

    int employeeID;
    String name;

    String jobTitle;

    EmployeeClass(String name, int employeeID, String jobTitle ){
        this.employeeID=employeeID;
        this.name=name;
        this.jobTitle=jobTitle;

    }
    void printInfo(){
        System.out.println("My name is: "+name+" My Employee Id number is: "+employeeID+" My job title is"+jobTitle);

    }

}
class FullTime extends EmployeeClass{

    String benefits;

    FullTime(String name, int employeeID, String jobTitle, String benefits){
        super(name, employeeID, jobTitle);
        this.benefits=benefits;

        }

        void display(){
            System.out.println("Full time employee with receive benefits which include: ");
        }

        }

class PartTime extends EmployeeClass{

    double hoursWorked;

    PartTime(String name, int employeeID, String jobTitle, double hoursWorked ){
        super(name, employeeID, jobTitle);
        this.hoursWorked=hoursWorked;


    }

    void hours(){
        System.out.println("As a part time employee, I work "+hoursWorked+" hours");
    }

}