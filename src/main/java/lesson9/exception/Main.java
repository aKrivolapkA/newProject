package src.main.java.lesson9.exception;

public class Main {
    public static void main(String[] args) throws DogIsNotReadyException {
        Dog dog = new Dog("muchtar");
        dog.putCollur();
        dog.putMuzzle();
        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("проверяем снаряжение. Ошейник надет " +dog.isCollarPutOn()+ " поводок " + dog.isLeashPutOn() + " намордник " + dog.isMuzzlePutOn());
        }
        dog.putLeash();
        dog.walk();
    }
}
