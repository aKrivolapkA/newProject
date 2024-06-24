package src.main.java.lesson9.strings;

import java.util.Arrays;

public class GetFromString {
    public static void main(String[] args) {
        String str1= "Java";
        char c =str1.charAt(2); // charAt получить из строки символ
        System.out.println(c);


        String str2="hello world";
        int start= 6;
        int end = 10;
        char [] chars= new char[end-start];
        str2.getChars(start,end,chars,0); //F
        System.out.println(chars);
    }
}
