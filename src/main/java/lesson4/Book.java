package src.main.java.lesson4;

public class Book {
    // поля класса book
    public String name;
    public String author;
    public int year;

    //конструтор без параметров
    Book(){
        name = "Nothing";
        author = "Nothing";
        year = 0;
    }
    //Инициализатор  тоже самое что и конструтор без параметров/ один раз при создании
    {
        name = "Nothing";
        author = "Nothing";
        year = 0;
    }
    //коструктор с параметрами
    Book(String name, String author,int year) {
         this.name = name; // this -  конкретно имя этого конструктора
        this.author = author;
        this.year = year;
    }
    public void info(){ //метод
        System.out.println("имя этой книги: "+ name);
    }
}