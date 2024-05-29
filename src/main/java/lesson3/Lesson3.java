package src.main.java.lesson3;

public class Lesson3 {

    public static void main(String[] args) {

        //обьявление массива
        double array[];
        int[] array2;

        int[] intArray1 = new int[100];//100 количество элементов , typ - 0
        int[] intArray2 = {0, 1, 2,}; // сразу добавляем значения в массив

        String[] catNames = new String[10];// default- null
        int[] cats = new int[10];// default 0

        int[] array3 = new int[]{1, 2, 10, 4, 5};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// 40 byte pamieci uzywamy

        int[] ints = {1, 2, 3};
        ints[1] = -1;
        ints[1]--;
        ints[1]++;
        ints[5]++; //java.lang.ArrayIndexOutOfBoundsException --нет такого значения в нашем массиве

    }
}