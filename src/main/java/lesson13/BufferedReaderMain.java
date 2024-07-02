package src.main.java.lesson13;

import java.io.*;

public class BufferedReaderMain {
    public static void main(String[] args) {
        //считывает посимвольно
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("notes7.txt"))) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.println((char) c);

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("-------------");
        //считывает построчно
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("notes7.txt"))) {
            String s;

            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----------------");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes8.txt"))) {
            String s;
            while (!(s = bufferedReader.readLine()).equals("ESC")) {
                bufferedWriter.write(s + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
