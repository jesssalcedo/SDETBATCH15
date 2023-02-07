package Class20;

import Class19Homework.JavaTeacher;

public class University {

    public static void main(String[] args) {

        JavaTeacher jt=new JavaTeacher();
        jt.homework(); // public
        // jt.grade - not available in different package
        // jt.scholorship ; is not visible in different package

    }
}
