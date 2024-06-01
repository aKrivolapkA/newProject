package src.main.java.lesson4;

public class OverloadProjekt {
    public static void main(String[] args) {
        Overload overload =new Overload();
        overload.test();
        overload.test(1);
        overload.test(1,2);
        overload.test(1.4);
    }
}
