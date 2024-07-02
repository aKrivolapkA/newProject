package src.main.java.lesson13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferesWriterMain {
    public static void main(String[] args) {
        try(BufferedWriter bufferesWriter = new BufferedWriter(new FileWriter("notes7.txt"))) {
            String text = "hell\nHej";
            bufferesWriter.write(text);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
