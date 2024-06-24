package src.main.java.lesson7.Interfases.part1.part3;

import src.main.java.lesson7.Interfases.part1.part2.Messenger;
import src.main.java.lesson7.Interfases.part1.part2.Telegram;

public class Client {
   //private Viber viber;
   //private Telegram telegram;
   //private WhatsApp whatsApp;
    private Messenger messenger;// чтобы не указывать конркетный класс/ можем указать интерфейс // вызывали интерфейс

    public Client(){
        this.messenger = new Telegram(); //вмемто указания 3  / можем указать один элесент с интерфейса
    }
}
