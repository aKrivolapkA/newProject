package src.main.java.lesson3;

import java.util.Arrays;

public class ArraysEquals { // сравнивает каждый элемент с каждым
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 1, 3, 4, 5};
        System.out.println(Arrays.equals(a,b));

    }
}
