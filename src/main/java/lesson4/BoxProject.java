package src.main.java.lesson4;

public class BoxProject {
    public static void main(String[] args) {
        Box box1 = new Box();// создание обьекта класс ( контруктор без параметров)
        Box box2 = new Box(10, 20, 15);// создание обьекта класс( вызов конструктора с параметрами

        System.out.println(box1.height);//0.0
        System.out.println(box2.height);//
        box1.width = 1;
        box1.height = 2;
        box1.depth = 3;
        System.out.println(box1.height);//2.0

        double volume = box2.height * box2.depth * box2.width;
        System.out.println("Обьем коробкт 2" + volume);

        Box box3 = new Box();
        Box box4 = box3;

        box3.height = 1;
        System.out.println(box4.height); // box 3 and box 4 ссылаются на один и тот же обьект

        // модификаторы доступа
        //privet только внутри данного класса
        // protected доступ внутри класса и имеют доступ все потомки
        // public доступ во всем проекте
        // default - когда ничего не ставим, доступ имеют все классы,которые обьявлены в том же пакете
    }
}