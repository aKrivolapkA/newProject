package src.main.java.lesson13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain1 {
    public static void main(String[] args) {
        File file = new File("//Users//alena//Desktop//mynewFile.txt");
     try(FileWriter fileWriter = new FileWriter("mynewFile.txt")){
         String text = "hello world";
         fileWriter.write(text);
         boolean created = file.createNewFile();
         if(created){
             System.out.println("file has been created");
         }else{
             System.out.println("no");
         }
     }catch (IOException ex){
         System.out.println(ex.getMessage());
     }
        System.out.println(file.getParentFile());

    }

}
