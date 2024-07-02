package src.main.java.lesson13;

import java.io.*;

public class PersonDataMain {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 34, 180, false); // ввод инфы в плик
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeUTF(tom.getName());
            dos.writeInt(tom.getAge());
            dos.writeDouble(tom.getHeight());
            dos.writeBoolean(tom.isMarried());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))){ // получение инфы из плика
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean isMarried =dis.readBoolean();
            System.out.printf("Name: %s,Age: %d, Height : %.2f, Married: %b\n",
                    name,age,height,isMarried);
            System.out.println("file has been read");
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
