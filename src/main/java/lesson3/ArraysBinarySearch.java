package src.main.java.lesson3;

import java.util.Arrays;

public class ArraysBinarySearch { // поиск элемента в массиве по индексу
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        Arrays.sort(intArray);
        int key = 3;
        System.out.println(key + " расположен  по индексу " +
                Arrays.binarySearch(intArray,key));
    }
}