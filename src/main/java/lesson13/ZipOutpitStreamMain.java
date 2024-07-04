package src.main.java.lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutpitStreamMain { //сделать архив
    public static void main(String[] args) {

        String fileName = "//Users//alena//Desktop//Notatnik1.txt";
        try (ZipOutputStream zipOutpitStream = new ZipOutputStream(new FileOutputStream("//Users//alena//Desktop//Notatnik//output.zip"))) {
            FileInputStream fileInputStream=  new FileInputStream(fileName);
            ZipEntry entry = new ZipEntry("MeNewFile.txt");
            zipOutpitStream.putNextEntry(entry);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            // add coderzy,oje k archuwu
            zipOutpitStream.write(buffer);
            zipOutpitStream.closeEntry();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
