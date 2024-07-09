package src.main.java.lesson15;

public interface Printable {
    void print(String s);

    public static void main(String[] args) {
        Printable printable = s -> System.out.println( s );
        printable.print("ddd");

    }
}
