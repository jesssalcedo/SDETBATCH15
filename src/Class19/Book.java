package Class19;

public class Book {

    String name;

    int pages;

    String genre;



    Book(String name, int pages){
        this.name=name;
        this.pages=pages;

    }
    Book(String name, int pages, String genre){
        this(name, pages);
        this.genre=genre;
    }

    void printInfo(){
        System.out.println("Name of book: "+this.name+" Amount of pages: "+this.pages+"The genre: "+this.genre);
    }


}

