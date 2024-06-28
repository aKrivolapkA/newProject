package src.main.java.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Metods metods = new Metods();
        ArrayList<String> color  = new ArrayList<>();
        color.add("Red");
        color.add("Yellow");
        color.add("Green");

        ArrayList<Integer> number  = new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(5);
        ArrayList<Integer> number2  = new ArrayList<>();
        number.add(3);
        number.add(4);
        number.add(5);

        metods.getColorsList(color);

        List<String> strings = new ArrayList<>();
        strings.add("Red");
        strings.add("Yellow");
        strings.add("Green");
        metods.printCollection(strings);
        System.out.println("____________");
        metods.addOrange(color);
        System.out.println("____________");
        metods.changeColor(color);
        System.out.println("____________");
        metods.getReverseList(color);
        System.out.println("____________");
        metods.swapFirstAndLast(number);
        System.out.println("____________");
        metods.join(number,number2);
        System.out.println("____________");
        metods.printUniqueCharacters("HelloWorld");
        System.out.println("____________");
        HashSet<String> words = new HashSet<>();
        words.add("шалаш");
        words.add("дом");
        words.add("слово");
        metods.getPalindrows(words);






    }
}
