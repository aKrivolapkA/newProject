package src.main.java.lesson13;

import javax.imageio.IIOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamMain { //для него не нужно закрывать потоки
    public static void main(String[] args) {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String text = "hello World";

        byte[] buffer = text.getBytes();//перевели в массив
        try {
            byteArrayOutputStream.write(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //превращаем массив байтов в строкву
        System.out.println(byteArrayOutputStream.toString());


        byte[] array = byteArrayOutputStream.toByteArray();// перевод в байтовый массив строки
        for( byte b :array){
            System.out.print((char)b);
        }

        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        byte[] buffer1 = text.getBytes();
        try {
            byteArrayOutputStream1.write(buffer1);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        try(FileOutputStream fileOutputStream = new FileOutputStream("hello.txt")) { //если не указать деректорию то создается в проекте
            byteArrayOutputStream1.writeTo(fileOutputStream);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
