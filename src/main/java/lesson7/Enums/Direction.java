package src.main.java.lesson7.Enums;

public enum Direction {
    UP,DOWN;

    public Direction opposite(){
        return this == UP ? DOWN: UP;
    }
}
