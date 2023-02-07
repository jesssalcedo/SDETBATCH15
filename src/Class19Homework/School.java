package Class19Homework;

public class School {

    public static void main(String[] args) {

        Teacher teacher1=new Teacher();
        teacher1.teacherName="Melanie";
        teacher1.teacherId="T1234";
        System.out.println("THis is principal "+teacher1.teacherName);
        //teacher1.extraPoint();

        MathTeacher mt=new MathTeacher();
        mt.teacherName="Luna";
        mt.teacherId="M7896";
        mt.subject="Math";
        System.out.println("Teacher "+mt.teacherName+" teach "+mt.subject);
        mt.excellent();
        mt.homework();


    }
}
