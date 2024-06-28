package src.main.java.lesson11.printer;

public class PrinterMain {
    public static void main(String[] args) {

        Printer printer = new Printer();
        String [] strings ={"Tom","Nick"};
        Integer [] ints  ={123,345};

        printer.<String>print(strings); // параметризация метода ( указываем какой тип данных вызываем)
        printer.<Integer>print(ints);
    }
}
