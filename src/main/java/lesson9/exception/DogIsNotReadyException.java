package src.main.java.lesson9.exception;

public class DogIsNotReadyException  extends  Exception { // чтобы сделать исключением
    public DogIsNotReadyException(String message){ // создаем конструтор
        super(message); //вызов конструтор супер класса
    }

}
