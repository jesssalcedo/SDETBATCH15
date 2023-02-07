package Class19Homework;

public class JavaTeacher extends Teacher{

    void coce(){
        System.out.println("Java teacher teaches how to code");
    }

    // create main method

    public static void main(String[] args) {

        JavaTeacher jt=new JavaTeacher();
        jt.teacherId="T1236";
        jt.teacherName="Jessica";

        jt.homework(); // public
        jt.grade(); // protected
        jt.scholarship(); // default
       // jt.extraPoint(); - private
    }
}
