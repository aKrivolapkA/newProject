package src.main.java.lesson7.Interfases.part1;

public interface Printable {// описывает поведение/ использует методы которые потом используем/ нужно испольоваьь все методы/ по умолчанию константы //

    void print();

    //методы по умолчанию
    default void print1(){ //default метод можно не использовать в отличии от метода выше и можно не использовать   @Override
        System.out.println("undefined printable");
    }
    static void read(){
        System.out.println("Read printable");
    }

}
