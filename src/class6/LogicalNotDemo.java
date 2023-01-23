package class6;

public class LogicalNotDemo {

    public static void main(String[] args) {
        System.out.println(false);
        System.out.println(!false);

        boolean condition=!true;
        System.out.println(condition);

        String password="123";

        if(!password.equals(("Pass123"))){ // Not will convert the condition to false
            System.out.println("wrong password");
        }

        boolean isRaining=true;

        if(!isRaining){
            System.out.println("Lets go for a walk");
        }else {
            System.out.println("Lets take the umbrella");
        }

    }
}
