package src.main.java.lesson4;

public class Overload { // перегрузка метода
    void test() {
        System.out.println("Параметры отсутсвуют");
    }

    //перегружаемый метод с одним параметром
    void test(int a) {
        System.out.println("a: " + a);
    }

    //перегружаемый метод с 2 параметрами
    void test(int a, int b) {
        System.out.println("a: " + a + ",b: " + b);
    }
    //изменили тип параметра на double
    void test(double a) {
        System.out.println("a: " + a);
    }

}
