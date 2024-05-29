package src.main.java.lesson3;

public class For { //циклы
    public static void main(String[] args) {
//        // for
//        int n;
//        int a, b = 4;
//
//      for (n = 10; n > 0; n--) {
//          System.out.println("hello " + n);
//      }
//
//      System.out.println("-------------------------");
//      for ( int q = 1; q < 5; q++) { // oт какого числа начинаем; до какого выполняем; и что делаем
//          System.out.println("hello " + q);
//      }
//
//        System.out.println("-------------------------");
//
//        for (a=1;a<b;a++){
//            System.out.println("a = " + a);
//            System.out.println("b = " + b) ;
//            b--;
//        }
//
//        System.out.println("-------------------------");
//        for (a=1,b = 4 ; a<b;a++){
//            System.out.println("a = " + a);
//            System.out.println("b = " + b) ;
//            b--;
//        }
//        System.out.println("-------------------------");
//        int i = 0;
//        boolean done = false;
//
//        for (; !done; ) {
//            System.out.println("i is " + i);
//            if (i == 10) {
//                done = true;
//            }
//            i++;
//        }
//
//        System.out.println("-------------------------"); // бесконечный цикл
//        int i1 = 1;
//        for (; ; ) {
//            System.out.println(i1 * i1);
//        }

        for (int i= 0; i<10;i++){
            for(int j =i;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        // foreach цикл вывод массива
        int [] array =new int[]{1,2,3,4,5};

        for (int i1 :array){ //i1- просто переенная
            System.out.println(i1);
        }

        System.out.println("-----------------------");
        //цикл for вывод массива
        for (int i = 0; i<array.length; i++){ //array.length - длина массива
            array[i] = array[i] *2;
            System.out.println(array[i]);
        }


    }
}
