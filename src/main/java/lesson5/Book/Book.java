package src.main.java.lesson5.Book;

public class Book {
    protected String author;
    protected int year;
    protected String name;
    private static int counter = 0;

    static {
        counter=1;
        System.out.println("вывод статического блока" );
    }
    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        counter++;

    }

    public void display() {
        System.out.printf(" ID %d \n", counter);
    }
}
