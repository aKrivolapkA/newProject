package src.main.java.lesson6;

public class Creature {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

     public  Creature() {

    }

    public void eat() {
        System.out.println("om nom nom");
    }

    public void identifyCreater (Creature creature){
        if(creature instanceof Human){
            System.out.println("это человек");
        } else if (creature instanceof Get) {
            System.out.println("Это кот");
        }else {
            System.out.println("неизвестное существо ");
        }
    }
}
