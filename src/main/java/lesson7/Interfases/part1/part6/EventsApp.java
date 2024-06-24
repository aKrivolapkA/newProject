package src.main.java.lesson7.Interfases.part1.part6;

public class EventsApp {
    public static void main(String[] args) {

        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();

        //создание анонимного класса . анонимный - потому что без названия
        Button tvButton = new Button(new EventHandler() {
            private boolean on = false;

            @Override
            public void execute() {
                if (on) {
                    System.out.println("Телевизор выключен");
                    on = false;
                } else {
                    System.out.println("Телевизор включен");
                    on = true;
                }
            }
        });

        Button printButton = new Button( new EventHandler(){

            @Override
            public void execute() {
                System.out.println("запущенна печать на принтере");
            }
        });
        tvButton.click();
        printButton.click();
        tvButton.click();

    }
}
