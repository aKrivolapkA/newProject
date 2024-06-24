package src.main.java.lesson7.Interfases.part1;

public interface Calcilatable {
    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a, b, c);
    }

    private int sumAll(int... values) { // (int... values) передавать сколько угодно значений // privet
        int result = 0;
        for (int n : values) {
            result += n;
        }
        return result;
    }
}
