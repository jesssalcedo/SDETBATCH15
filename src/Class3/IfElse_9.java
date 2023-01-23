package Class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';

        if(c=='M'){
            System.out.println("Male");
        }

        String name="Sam";
        //with non-primative data types such a string we cant use == symbol

        if(name.equals("Sam")){
            System.out.println("Amazing Student");
        }
        if(!name.equals("Sam")){
            System.out.println("Super amazihng student");
        }
    }
}
