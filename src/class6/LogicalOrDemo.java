package class6;

public class LogicalOrDemo {

    public static void main(String[] args) {

        String day="Monday";

        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today Enjoy");

        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class");
        }else if (day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing today");
        }else if (day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else {
            System.out.println("Wrong day entered");
        }
    }
}
