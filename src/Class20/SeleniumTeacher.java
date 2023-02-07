package Class20;

import Class19Homework.Teacher;

public class SeleniumTeacher extends Teacher {

    public static void main(String[] args) {

        SeleniumTeacher selenium=new SeleniumTeacher();
        selenium.homework(); // public
        selenium.grade(); // protected
        // selenium.scholarship - default not available
    }
}
