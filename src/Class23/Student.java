package Class23;

public class Student {

    String studentID;
    String name;

    public void studyTime(){
        System.out.println("I study very hard for school");
    }
    public void doHomework(){
        System.out.println("I will complete projects");


    }
}
class SyntaxStudent extends Student{

    @Override
    public void studyTime() {
        System.out.println("I have to watch videos and study extra code with java");
    }

    @Override
    public void doHomework() {
        System.out.println("Group projects are very important in programming");
    }

    public void coding(){
        System.out.println("I am learning how to code in Syntax class");
    }
}
class CollegeStudent extends Student{

    @Override
    public void studyTime() {
        System.out.println("Studying is very important ");
    }

    @Override
    public void doHomework() {
        System.out.println("I will complete college projects");
    }
    public void Bachelor(){
        System.out.println("I am in college to achieve my bachelor degree");
    }
}
class SchoolStudent extends Student{

    @Override
    public void studyTime() {
        System.out.println("Much less study time then college");
    }

    @Override
    public void doHomework() {
        System.out.println("Not as many project in school as colllege");
    }
}