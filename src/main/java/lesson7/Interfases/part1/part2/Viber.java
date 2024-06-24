package src.main.java.lesson7.Interfases.part1.part2;

public class Viber implements  Messenger{

    @Override
    public void sendMessenge() {
        System.out.println("send message to Viber");

    }

    @Override
    public void receiveMessenge() {
        System.out.println("Read message in Viber ");

    }
}
