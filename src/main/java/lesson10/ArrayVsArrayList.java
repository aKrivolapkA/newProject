package src.main.java.lesson10;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
       // создание
        String[] strings = new String[10];//array создание
        ArrayList<String> list = new ArrayList<>(); //array list создание

        //количество элементов - длина
        int n = strings.length;
        int n1 =list.size();

        //взятие элемента
        String s = strings[3];
        String s1 = list.get(3);

        //записать элемента
        strings[3] = "10";
        list.set(3,"5");

        //добавить элимент в конец массива
        list.add("ssss");

        // вставка на определенную позицию жлемента
        list.add(3,"dddd");
        list.add(0,"dddd");  // w naczalo

        //удаление
        strings[2]= null; //останется пустое пространство
        list.remove(3); //все остальные элементы подвинуться

        //превращения листа в массив

    }
}