package src.main.java.lesson9.strings;

public class StringCompare {
    public static void main(String[] args) {
        String str1 ="hello";
        String str2 ="Hello";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2));// true игнорировать регистр в стринге

        String str3 ="Hello  World";
        String str4 ="I work";
        boolean result = str3.regionMatches(6,str4,2,3);//regionMatches чтобы проверить часть стринга совпалает ли //6 начальний индекс в первой строке
        //str4 савниваем со стракой// 2от какого берем и //4 сколько символов сравниваем
        System.out.println(result);


        String str5 ="hello";
        String str6 ="world";
        String str7 ="hell";

        System.out.println(str5.compareTo(str6));//
        System.out.println(str5.compareTo(str7));//compareTo сравнение по символам  на 15 символов

    }
}
