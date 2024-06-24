package src.main.java.lesson7.Interfases.part1;

import src.main.java.lesson7.Interfases.part1.part4.WaterPipe;

public class Program {
    public static void main(String[] args) {
        Calcilatable calcilatable = new Calculation();
        System.out.println(calcilatable.sum(1, 2));
        System.out.println(calcilatable.sum(1, 2, 3));

        WaterPipe pipe = new WaterPipe();
        pipe.printState(0);


        //Book book = new Book("test","test"); это все то же самое что и  read(new Book("java","author"));
        //read(book);

        read(new Book("java","author")); // вызов метода рид с параметрами
        read(new Journal("java")); // вызов метода рид с параметрами

        Printable printable = createPrintable("hello", true); //Printable printable  - переменная printable типа Printable
        printable.print();
    }

    static void read(Printable p) {// как переменная идет интерфейс Printable
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if (option) {
            return new Book(name, "Wojna i mir");
        }else {
            return new Journal(name);
        }
    }
}
