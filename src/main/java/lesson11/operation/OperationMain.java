package src.main.java.lesson11.operation;

public class OperationMain {
    public static void main(String[] args) {

        Operation operation =new Operation(1.2,1.3);
        System.out.println(operation.getSum());
        Operation operation1 =new Operation(1,1.3); // int + double
        System.out.println(operation1.getSum());
//ошибка будет тк тип стринг не  класс от которого мы наследуемся

       // Operation operation3 =new Operation("asd",1.3);
       // System.out.println(operation3.getSum());


    }
}
