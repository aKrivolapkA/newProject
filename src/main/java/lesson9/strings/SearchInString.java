package src.main.java.lesson9.strings;

public class SearchInString {
    public static void main(String[] args) {
        String str1 = "myFile.exe";
        boolean start = str1.startsWith("my"); // проверяет начинается ли
        boolean end = str1.endsWith("exe"); // проверяет заканчивается  ли
        System.out.println(start);
        System.out.println(end);

        String str2 = "This is a  new string";
        System.out.println(str2);
        System.out.println("index of (i) "+ str2.indexOf('i')); //указывает позицию первую которую встречает  для того что написали
        System.out.println("last index of (i) "+ str2.lastIndexOf('i')); //указывает последнию  позицию  которую встречает
        System.out.println("index of (is) "+ str2.indexOf("is")); //указывает первую   позицию  которую встречает для стринга
        System.out.println("index of (is) "+ str2.lastIndexOf("is")); //указывает последнию  позицию  которую встречает
        System.out.println("--------------");
        System.out.println("index of (i,4) "+ str2.indexOf('i',4)); //начинаем с 4

        System.out.println("index of (is,4) "+ str2.indexOf("is",4));
        System.out.println("index of (is,4) "+ str2.lastIndexOf("is",4));

    }
}
