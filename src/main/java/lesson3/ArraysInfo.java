package src.main.java.lesson3;

public class ArraysInfo {
    public static void main(String[] args) {
        int array[] = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(array[2]);
        //  System.out.println(array[2] + " " + array[5]);// ошибка тк индекс 5 за рамками массива
        System.out.println("array.length: " + array.length);

        int lastIndexValue = array.length - 1;
        System.out.println("last index value: " + array[lastIndexValue]);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("--------------------------");

        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = i;//элемент массива приравниваем к счетчику
            System.out.println(array1[i]);
        }
        System.out.println("--------------------------");
        int[] array2 = new int[10];
        int min = 0;
        int max = 10;
        for (int i = 0; i < 10; i++) {
            array2[i] = (int) (Math.random() * (max - min)); //значкния от [0; max-min)
            System.out.println(array2[i]);
            System.out.println(array2[1]);
        }

        System.out.println("--------------------------");
        double average;
        double sum = 0;
        int length =array2.length;
        for (int i = 0; i<length; i ++){
            sum +=array2[i];
        }
        average = sum/length;
        System.out.println("average: " + average);

        System.out.println("--------------------------"); //foreach
        for(int element: array2){
            System.out.println(element);
        }
    }
}