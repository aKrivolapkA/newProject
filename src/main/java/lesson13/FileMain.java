package src.main.java.lesson13;

import java.io.File;
import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {
        String path = "//Users//alena//Desktop//SomeDir1"; //указать папку которая уже есть
        File dir1 = new File(path);
        File file1 = new File(path, "helloWord.txt");// создать пустой плик в папке
        File file2 = new File(dir1, "helloWord2.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        if (dir1.isDirectory()) {
            for (File element : dir1.listFiles()) {
                if (element.isDirectory()) {
                    System.out.println(element.getName() + "\t foler");
                }else{
                    System.out.println(element.getName() + "\t file");
                }
            }
        }
        File dir2 = new File( "//Users//alena//Desktop//SomeDir1");
        boolean isCreated  =dir2.mkdir();
        if( isCreated){
            System.out.println("jest ok ");
        }

        File newDir = new File( "//Users//alena//Desktop//AAAAAAAA");
        dir2.renameTo(newDir);

        boolean isDeletes= newDir.delete();
        if( isDeletes){
            System.out.println("usuniete  ");
        }
        File file = new File("//Users//alena//Desktop//newFile.txt");
        System.out.println(file.getName());
        System.out.println(file.getParentFile());
        //проверить есть ли файл
        if( file.exists()){
            System.out.println("exicts");
        }else {
            System.out.println("no ");
        }
        System.out.println(file.length()); /// размер файдла



        if( file.canRead()){
            System.out.println("can read");
        }else {
            System.out.println("no ");
        }



        if( file.canWrite()){
            System.out.println("can Write");
        }else {
            System.out.println("no Write ");
        }

    }
}
