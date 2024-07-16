package src.main.java.lesson9.strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = new String();//пустая строка
        String str3 = new String(new char[]{'h', 'e', 'l'});// строка из массива симвалов
        String str4 = new String(new char[]{'h', 'e', 'l'}, 0, 1);// строка из симвалов offset- с какого начинваем count- сколько выводим ( нумерация с нуля тк массив)

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("----------------------");
        char[] chars = {'a', 'b', 'c'};
        String str5 = new String(chars);
        System.out.println(str5);
        System.out.println("----------------------");

        char[] chars1 = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str6 = new String(chars1, 2, 3); // как и выше ( c 2 вклюяительно)

        System.out.println(str6);
        System.out.println("----------------------");
        char[] chars2 = {'J', 'A', 'V', 'A'};
        String str7 = new String(chars2);
        String str8 = new String(str7);

        System.out.println(str7);
        System.out.println(str8);

        System.out.println("----------------------");
        byte[] ascii = {65, 66, 67, 68, 69, 70}; //есть какая то таблица для байтов
        String str9 = new String(ascii);
        System.out.println(str9);
        String str10 = new String(ascii, 2, 3);
        System.out.println(str10);
        System.out.println("----------------------");

        char[] chars3 = {'a', 'b', 'c'};
        String str11 = new String(chars3);
        System.out.println(str11.length());// вывести длину строки
        // из стринга сделать массив
        String str13 = "this is a String";
        char[] chars4 = str13.toCharArray();
        System.out.println(Arrays.toString(chars4));
    }
}