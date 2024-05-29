package src.main.java.lesson3;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        int [] array = {3,-5,6,7,8,15,1};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);// сортировка от меньщечего числа к большему
        System.out.println(Arrays.toString(array));


        Integer [] array1 = {3,-5,6,7,8,15,1};
        Arrays.sort(array1, Collections.reverseOrder());// сортировка от большего к меньщему
        System.out.println(Arrays.toString(array1));

        //сортировка пузырьком

        int[] array2 ={5,8,3,7,0};
        for ( int i = 0; i< array2.length; i++){
            for (int j = 0; j<array2.length -1;j++){
                if(array2[j]>array2[j+1]){
                    int temp = array2[j];
                    array2[j]=array2[j+1];
                    array2[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}