package class9;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create an array of countries.
        While retrieving all values from an array print capital for each country choose any five countries.
         */

        String[] countries = {"United States","Japan", "Australia", "Egypt", "Ecuador"};


        for (int i = 0; i < countries.length; i++) {

            switch (countries[i]){
                case "United States":
                    System.out.println("The capital is Washington DC");
                    break;
                case "Japan":
                    System.out.println("The capital is Tokyo");
                    break;
                case "Australia":
                    System.out.println("The capital is Canberra");
                    break;
                case "Egypt":
                    System.out.println("The capital is Cairo");
                    break;
                case "Ecuador":
                    System.out.println("The capital is Quito");
                default:
                    System.out.println("Error");
            }


            }
        }
    }
