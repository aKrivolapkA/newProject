package src.main.java.lesson7.Enums;

public enum DayOfWeekEnum {
    MONDAY("Понедельник",1),
    TUESDAY("Вторник",2),

    WEDNESDAY("Среда",3),
    THURDSAY("Четверг",4),
    FRIDAY("Пятница",5),
    SATURDAY("Суь",6),
    SUNDAY("воскр",7);

    String nameRus;
    int number;

    DayOfWeekEnum(String nameRus, int number) {
        this.nameRus = nameRus;
        this.number = number;
    }

    public String getNameRus() {
        return nameRus;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberByName(String name){
        for (DayOfWeekEnum day :values()){//:values() возвращает все значения
            if(day.getNameRus().equals(name)){
               return day.getNumber();
            }
        }
        return 0;
    }
}
