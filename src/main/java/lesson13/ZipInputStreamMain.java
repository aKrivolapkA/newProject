package src.main.java.lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;


public class ZipInputStreamMain {
    public static void main(String[] args) {

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("//Users//alena//Desktop//Notatnik//output.zip"))) {
            ZipEntry entry;
            String name = null;
            long size;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("name %s, size %d", name, size);

            }
            FileOutputStream fileOutputStream = new FileOutputStream("//Users//alena//Desktop//Notatnik//new" +name);
            for (int i = zipInputStream.read(); i !=-1; i= zipInputStream.read()) {
                fileOutputStream.write(i);
            }
            fileOutputStream.flush();
            zipInputStream.closeEntry();
            fileOutputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

}

