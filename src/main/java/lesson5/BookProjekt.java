package src.main.java.lesson5;

public class BookProjekt {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир","Толстой",1863);
        book1.display();
        Book book2 = new Book("Отцы и дети","Тургенев",1862);
        book2.display();
    }
}
