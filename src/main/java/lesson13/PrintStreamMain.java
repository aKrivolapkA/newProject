package src.main.java.lesson13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain {
    public static void main(String[] args) {
        String filePth = "//Users//alena//Desktop//Notatnik3.txt";
        String text ="hello world3";
        try(FileOutputStream fileOutputStream = new FileOutputStream(filePth)){
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(text);
            System.out.println("запись в файл произведена");
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try(PrintStream printStream = new PrintStream("notess4.txt")){
            printStream.print("Hello\n");
            printStream.println("Welcome");
            printStream.printf("Name: %s\n", "Tom");

            String message ="PrintStream";
            byte [] messageToBytes = message.getBytes();
            printStream.write(messageToBytes);
            System.out.println("the file has bees written");

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
