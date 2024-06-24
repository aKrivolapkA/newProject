package src.main.java.lesson7.Interfases.part1.part6;

public class Button {

    EventHandler handler; //поле интерфейса

     Button(EventHandler handler) { //конструтор с интерфесом
        this.handler = handler;
    }

    public  void click(){
         handler.execute();
    }

}