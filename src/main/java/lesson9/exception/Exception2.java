package src.main.java.lesson9.exception;

public class Exception2 {
    static void throwOne() throws IllegalAccessException{ //throws  - ключевое слово для обработки исключения в методе
        System.out.println("Запись в теле метода throwOne ");
        throw  new IllegalAccessException("demo"); //throw
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException ex){
            System.out.println("перехвачено исключение : "+ ex);
        }
    }
}
