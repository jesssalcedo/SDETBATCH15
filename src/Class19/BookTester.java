package Class19;

public class BookTester {
    public static void main(String[] args) {


        Book book1=new Book("It ends with us ", 150);
        Book book2=new Book("Atomic Habits", 200, "Non-fiction");
        book1.printInfo();
        book2.printInfo();

    }
}