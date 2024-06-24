package src.main.java.lesson10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Metods {
    public void getColorsList(ArrayList<String> color) {
        System.out.println(color);
    }

    public void printCollection(Collection<String> collection) {
        System.out.println(collection);
    }

    public void addOrange(ArrayList<String> color) {
        color.add(1, "Orange");
        System.out.println(color);
    }

    public void changeColor(ArrayList<String> color) {
        for (int i = 0; i < color.size(); i++) {
            //if (color.contains("Green")) {
            //    //color.set((i),"White");//не будет работать поменяет все на грин

            //    color.remove("Green");
            //    color.add("White");

            // так же можно вот так
            if (color.get(i).equals("Green")) {
                color.set(i, "White");
            }
        }
        System.out.println(color);
    }

    public void getReverseList(ArrayList<String> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    public void swapFirstAndLast(ArrayList<Integer> list) {
        int listSize = list.size();
        int lastElement = list.get(listSize - 1);
        list.set(listSize - 1, list.get(0));
        list.set(0, lastElement);
        System.out.println(list);
    }

    public void join(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(list);
    }

    public void printUniqueCharacters(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char el : chars) {
            set.add(el);
        }
        System.out.println(set);
        System.out.println(set.size());
    }

    public void getPalindrows(HashSet<String> set) {
        for (String el : set) {
            StringBuffer reverseString = new StringBuffer(el).reverse();
            if (el.equalsIgnoreCase(reverseString.toString())) {
                System.out.println(el);
            }
        }


    }
}