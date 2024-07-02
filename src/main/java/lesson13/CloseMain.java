package src.main.java.lesson13;

import java.io.FileInputStream;
import java.io.IOException;

public class CloseMain {
    public static void main(String[] args) {
        String filePath = "//Users//alena//Desktop//Notatnik1.txt";
        //close wuth try..cath..finally
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        //close with resoursces ( автоматически закрывается поток внутри)
        try(FileInputStream fileInputStream1= new FileInputStream(filePath)) {
            int i;
            while ((i = fileInputStream1.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}