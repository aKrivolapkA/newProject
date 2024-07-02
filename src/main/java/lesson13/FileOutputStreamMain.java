package src.main.java.lesson13;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
    public static void main(String[] args) {
        String text = "Hello world!";
        try (FileOutputStream fileOutputStream = new FileOutputStream("//Users//alena//Desktop//Notatnik1.txt")) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer,0,buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("the file has been written");
    }
}
