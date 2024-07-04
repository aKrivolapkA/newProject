package src.main.java.lesson14;

public class TreadMain {
    public static void main(String[] args) {
        Thread tread =Thread.currentThread(); // создаеи и получаем главынй поток программы
        System.out.println(tread.getName());
        System.out.println(tread);
    }
}
