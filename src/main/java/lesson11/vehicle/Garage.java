package src.main.java.lesson11.vehicle;

public class Garage<T extends Vehicle & iMove> {//ограничение на класс и интерфейс  которые можем принять

    private T[] members;

    public Garage(T[] members) {
        this.members = members;
    }
    public void info(){
        for (T member : members ){ //T потому что типа Т
            member.move();
        }
    }
}
