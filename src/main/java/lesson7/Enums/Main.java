package src.main.java.lesson7.Enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;


        if (season == Season.SPRING) {
            season = Season.SUMMER;
        }
        System.out.println(season);
        System.out.println(Season.class.getSuperclass());

        System.out.println(season.name());
        System.out.println(season.toString());
        System.out.println(season.ordinal());// порядковый номер в enum ( где был создан)
        System.out.println(Arrays.toString(Season.values())); // значения которые у нас в списке

        System.out.println("___________________________");
        Direction direction = Direction.UP;
        System.out.println(direction.opposite());

        System.out.println("___________________________");
        DayOfWeekEnum dayOfWeekEnum =DayOfWeekEnum.FRIDAY;
        System.out.println(dayOfWeekEnum.getNameRus());
        System.out.println(dayOfWeekEnum.getNumber());

        System.out.println("___________________________");

        int number = DayOfWeekEnum.MONDAY.getNumberByName("Понедельник");
        System.out.println(number);

        System.out.println("___________________________");

        Type type = Type.INTEGER;
        System.out.println(type.parse("1"));

        System.out.println(Type.class);//  узнать обтект принадлежит к какому классу
        System.out.println(Type.INT.getClass().getSuperclass()); // узнать в каком порядке  наш вложенный класс



    }
}
