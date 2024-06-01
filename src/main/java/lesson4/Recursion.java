package src.main.java.lesson4;

public class Recursion {
    public static void main(String[] args) {
    //method();// вызываем метод с другого класса... бесконченый вызов получится
  //  counter(10);
 //    int x = factorial(3);
 //       System.out.println(x);
 //   factorial1(6);

        System.out.println(fibonacci(33));
    }

    public  static void method(){
        System.out.println("Hello");
        method();
    }

    public  static void counter ( int n ){
        System.out.println(n);

        if(n==0){
            return;
        }
        counter(n-1);
    }

    // факториал  3! =3*2*1
    public  static int factorial(int x){
         if ( x==1){
             return 1;
         }
        System.out.println(x);
         return x*factorial(x-1);

    }
    public  static int factorial1(int x){
        int result = 1;
        for (  int i=1;i<=x; i++){
            result *=i;
        }
        System.out.println(result);
        return result;
    }

    // фибоначи - последрвательность цифр определенная// часто спрашивают на собесе
    public static int fibonacci (int n){
        if ( n==0 || n==1) {
            return n;
        }else {
            return  fibonacci(n-1) + fibonacci(n-2);
        }

    }
}

