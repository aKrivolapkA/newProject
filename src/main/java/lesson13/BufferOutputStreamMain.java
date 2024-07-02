package src.main.java.lesson13;

import java.io.*;

public class BufferOutputStreamMain {
    public static void main(String[] args) {
        String text = "Hello world2";
        try (FileOutputStream fileOutputStream = new FileOutputStream("notes1.txt");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)){
            byte[] buffer = text.getBytes();
            bufferedOutputStream.write(buffer,0,buffer.length); //записали в файл
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
        System.out.println();
    }
}