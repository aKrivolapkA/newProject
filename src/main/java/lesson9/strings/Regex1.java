package src.main.java.lesson9.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 { //регулярное выражение /какой то шаблон
    public static void main(String[] args) {
        String regex = "java";
        String regex1 = "\\d{3}";// шаблон строки из 3 цифровых символов


        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        //жадный режим  - самое длинное совпадение
        // сверхжадный режим  -
        // ленивый  режим- самое короткое совпадение

        //жадный режим
        String text = "egor Anna Aleksandr";
        Pattern pattern1 = Pattern.compile("A.+a"); // условие по которому ищем/ ишем чтобы начиналось с A . - любой a = заканчивалось
        Matcher matcher = pattern1.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        boolean isMatch = Pattern.matches("A.+a",text);// false потом что не полное совпадение
        System.out.println(isMatch);

        String text1 = "Anna";
        boolean isMatch1 = Pattern.matches("A.+a",text1);
        System.out.println(isMatch1);



        boolean isMatch3 = Pattern.matches(".*A.+a.*",text);// любой символ любое количнство раз / в середине паттерн и на конце тоже любой символ
        System.out.println(isMatch3);

        System.out.println("---------------");
        // сверхжадный режим  -  в скобках по другому вызываем
        String text2 ="aaaaabva";
        Pattern pattern2 = Pattern.compile("a++");
        Matcher matcher1 =pattern2.matcher(text2);
        while (matcher1.find()){
            System.out.println(text2.substring(matcher1.start(),matcher1.end()));
        }
        System.out.println("---------------");
        //ленивый режим - самое короткое совпадение 
        String text3 = "egor Anna Aleksandr";
        Pattern pattern3 = Pattern.compile("A.+?a"); // условие по которому ищем/ ишем чтобы начиналось с A . - любой a = заканчивалось
        Matcher matcher3 = pattern3.matcher(text3);
        while (matcher3.find()) {
            System.out.println(text.substring(matcher3.start(), matcher3.end()));
        }
        System.out.println("---------------");
        Pattern pattern4 = Pattern.compile(".*");
        System.out.println(pattern4);

        System.out.println(Pattern.matches("A.+a","Anna")); //возвращает или тру или фолс

        Pattern pattern5 = Pattern.compile(".*",Pattern.CASE_INSENSITIVE);
        System.out.println(pattern5.flags());//flags() номер флага ( можно провалиться)

        System.out.println("---------------");
        String s = "Egor Alla Anna";
        Pattern p =Pattern.compile("\\s"); //\\s
        String[] strings = p.split(s,2); //s страка 2 ограничение по количеству элеиентов . лимит - 1
        for (String str :strings){
            System.out.println(str);
        }
    }
}