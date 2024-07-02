package src.main.java.lesson13;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamMain {
    public static void main(String[] args) {
        String filePath = "//Users//alena//Desktop//Notatnik1.txt";
        String filePathNew = "//Users//alena//Desktop//Notatnik2.txt";
      // try (FileInputStream fileInputStream = new FileInputStream("//Users//alena//Desktop//Notatnik1.txt")) {
      //     // прочитать с помощью цикла
      //     int i;
      //     while ((i = fileInputStream.read()) != -1) {
      //         System.out.print((char) i);
      //     }
      // } catch (IOException ex) {
      //     System.out.println(ex.getMessage());
      // }
      // System.out.println("\nthe file has been read");


      // try (FileInputStream fileInputStream1 = new FileInputStream(filePath)) {

      //     byte[] buffer = new byte[fileInputStream1.available()];//fileInputStream1.available() размер нащего массивв
      //     fileInputStream1.read(buffer, 0, fileInputStream1.available());
      //     System.out.println("File data");
      //     // закинули в массив и проходимся по массиву
      //     for (int i = 0; i < buffer.length; i++) {
      //         System.out.print((char) buffer[i]);
      //     }
      // } catch (
      //         IOException ex) {
      //     System.out.println(ex.getMessage());
      // }
      // System.out.println("\nthe file has been read again ");

        System.out.println("--------------------------");
        try (FileInputStream fileInputStream2 = new FileInputStream(filePath);// считали файл
             FileOutputStream fileOutputStream2 = new FileOutputStream(filePathNew)) { //
            byte[] buffer = new byte[fileInputStream2.available()];
            //считаем буффер
            fileInputStream2.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fileOutputStream2.write(buffer, 0, buffer.length);
            System.out.println("File data: ");

        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\nthe file has been read again ");


    }
}