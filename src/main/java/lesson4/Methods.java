package src.main.java.lesson4;

public class Methods {
    // создание метода

    // методы которые возвращают значение - называются функциями
    public  int factorial (){
        return 1;
    }


    // метод который ничего не возвращает - называется процедураё
    public void hello(){
        System.out.println("Hello");
    }

    int square (int i){
        return  i*i;
    }

    int getSum( int ...numbers){ // когда не знаем какое количество переменных хотим передать...  все числа запихнуться в массив
        int result = 0;
        for ( int number :numbers){
            result+=number;
        }
        return result;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.square(5));// i - параметр 5 аргумент

        System.out.println("------------------");

        int number = methods.getSum();
        System.out.println(number);

        int number1 =methods.getSum(10,20);
        System.out.println(number1);

        int number2 =methods.getSum(10,20,60,55,4);
        System.out.println(number2);
    }
}
