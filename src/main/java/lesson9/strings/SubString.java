package src.main.java.lesson9.strings;

public class SubString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String replaceStr1 =str1.replace('l','a'); // l какой заменяем a на какой заменяем
        String replaceStr2 =str1.replace("Hello","bye"); // l какой заменяем a на какой заменяем
        System.out.println(replaceStr1);
        System.out.println(replaceStr2);

        String str2 = "     Hello World      ";
        System.out.println(str2.trim());// trim() удаляет пробелы в начале и конце

        String str3 = "Hello World";
        String subSting1 = str3.substring(6);//substring вырезаем кусочек
        String subSting2 = str3.substring(3,8);// 3 вклюяается 6 не вклюяается
        System.out.println(subSting1);
        System.out.println(subSting2);
    }
}
