package src.main.java.lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterMain {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "//Users//alena//Desktop//Notatnik3.txt";
        PrintWriter writer = new PrintWriter(System.out); // выведим на кансоль
        writer.write("hello");
        writer.flush();
        writer.close();

        PrintWriter writer2 = null;
        writer2 = new PrintWriter(new File(path));
        writer2.write("updated information");
        writer2.flush();
        writer2.close();

    }
}
