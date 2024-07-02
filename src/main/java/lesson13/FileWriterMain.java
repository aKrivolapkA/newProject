package src.main.java.lesson13;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public static void main(String[] args) {

        try (FileWriter fileWriter = new FileWriter("notes4.txt")) {
            String text = "Hello it's me ";
            fileWriter.write(text);
            fileWriter.append("\n"); //append добавление
            fileWriter.append("a");
            fileWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}