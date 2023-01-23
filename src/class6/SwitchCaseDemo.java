package class6;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        String country="USA";

        System.out.println("USA");

        switch (country.toLowerCase()){ //converts to text to lowercase USA=usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("kebab");
                break;
            default:
                System.out.println("wrong country");

        }
    }

}
