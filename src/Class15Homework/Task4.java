package Class15Homework;

public class Task4 {

    String sayHello(String country) {
        switch (country) {
            case "Mexico":
                return "Hola";
            case "France":
                return "Salut";
            case "Japan":
                return "Konnichiwa";
            case "United States":
                return "Hello";
            default:
                return "error";


        }
    }

    public static void main(String[] args) {


        Task4 t4 = new Task4();
        System.out.println(t4.sayHello("France"));
    }
}
