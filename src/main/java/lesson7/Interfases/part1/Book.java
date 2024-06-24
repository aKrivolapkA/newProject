package src.main.java.lesson7.Interfases.part1;

import src.main.java.lesson7.Interfases.part1.part5.ExtendedPrintable;

public class Book implements ExtendedPrintable { //implements может быть много интерфейсов
    private String name;
    private String author;
    private int year;

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book %s, author %s, was created in %s yesr\n", name, author, year);

    }

    @Override
    public void print1() {
        ExtendedPrintable.super.print1();
    }

    @Override
    public void extendedPrint() {

    }
}
