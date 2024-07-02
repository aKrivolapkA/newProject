package src.main.java.lesson13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderMain {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("hello.txt")) {
//читаем посимвольно
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.println((char) c);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("______________________________");
        try (FileReader fileReader = new FileReader("notes6.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read()) != -1) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
