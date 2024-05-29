package src.main.java.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysConsole {
    public static void main(String[] args) {
        int[]a;
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt(); // сколько элементов будет в массиве
        a =new int[n];
        for (int i =0; i<n; i++){
            a[i] =input.nextInt(); // какие числа в массиве
        }
        System.out.println(Arrays.toString(a));
    }
}
