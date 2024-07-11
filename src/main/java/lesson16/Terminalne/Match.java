package src.main.java.lesson16.Terminalne;

import java.util.ArrayList;
import java.util.Arrays;

public class Match { // true or false возвращает
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("tom","sam","Bob","Alice"));

        //есть ли в потоке строка Больше 3 символов
        boolean any = names.stream().anyMatch(s-> s.length()>3);//anyMatch есть ли такая строка  которая соответсует условию
        System.out.println(any);

        //все  ли  строки в потоке равны   3 символом
        boolean all = names.stream().allMatch(s-> s.length()==3);//anyMatch все  ли  строки соответсуют условию
        System.out.println(all);

        //нет ли в потоке имени  bob
        boolean none = names.stream().allMatch(s-> s =="Bob");//none нет ли 
        System.out.println(none);

    }
}
