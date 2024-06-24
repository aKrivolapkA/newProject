package src.main.java.lesson7.Interfases.part1.part2;

public class Telegram implements  Messenger,Aplication {

    @Override
    public void sendMessenge() {
        System.out.println("send message to Telegram");

    }

    @Override
    public void receiveMessenge() {
        System.out.println("Read message in Telegram ");

    }
}