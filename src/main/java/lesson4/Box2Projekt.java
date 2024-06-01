package src.main.java.lesson4;

public class Box2Projekt {
    public static void main(String[] args) {


        Box2 box1 = new Box2();
        Box2 box2 = new Box2();


        box1.height =10;
        box1.depth=20;
        box1.width =5;
        System.out.println("Обьем box1 "+ box1.volume());


        box2.height =10;
        box2.depth=20;
        box2.width =5;
        System.out.println("Обьем box2 "+ box2.volume());


    }
}
