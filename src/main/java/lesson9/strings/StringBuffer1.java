package src.main.java.lesson9.strings;

public class StringBuffer1 { //для модификации строк  экономит ресурсы и не нужно создавать новую переменную это экономит память
    public static void main(String[] args) {

        String str = "Java";
        StringBuffer stringBuffer = new StringBuffer();//пустой и резервирует 16 символов в памяти

        StringBuffer stringBuffer1 = new StringBuffer(str);

        System.out.println("emkosc " + stringBuffer.capacity());//capacity
        System.out.println("emkosc " + stringBuffer1.capacity());
        stringBuffer1.ensureCapacity(32);// увеличиваем Capacity
        System.out.println("emkosc " + stringBuffer1.capacity());
        System.out.println("Dlina  " + stringBuffer1.length());

        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        char c = stringBuffer2.charAt(0);
        System.out.println(c);

        stringBuffer2.setCharAt(0, 'h');//заменить char  на какой позиции и на какую меняем
        System.out.println("_________________");
        StringBuffer stringBuffer3 = new StringBuffer("World");
        int startIndex = 1;
        int endIndex = 4;
        char[] chars = new char[endIndex - startIndex];
        stringBuffer3.getChars(startIndex, endIndex, chars, 0);
        System.out.println(chars);

        System.out.println("------------------");
        StringBuffer stringBuffer4 = new StringBuffer("Hello");
        stringBuffer4.append(" world"); //склеивает строки
        System.out.println(stringBuffer4);

        System.out.println("------------------");
        StringBuffer stringBuffer5 = new StringBuffer("World");
        stringBuffer5.insert(3, "IN"); //на позицию 3 хотим добавить
        System.out.println(stringBuffer5);


        System.out.println("------------------");
        StringBuffer stringBuffer6 = new StringBuffer("hello World");
        stringBuffer6.delete(0, 3); //какое удаляем с 0 до 3 0 вклбчительно 3 не включительно
        System.out.println(stringBuffer6);

        System.out.println("------------------");
        StringBuffer stringBuffer7 = new StringBuffer("World");
        stringBuffer7.deleteCharAt(2); // удаляем элемент на позиции 2
        System.out.println(stringBuffer7);


        System.out.println("------------------");
        StringBuffer stringBuffer8 = new StringBuffer("hello World");
        String s1 = stringBuffer8.substring(6); //тут нужно создать новую переменную
        System.out.println(s1);


        System.out.println("------------------");
        StringBuffer stringBuffer9 = new StringBuffer("hello World");
        String s2 = stringBuffer9.substring(2,4); //
        System.out.println(s2);

        System.out.println("------------------");
        StringBuffer stringBuffer10 = new StringBuffer("hello World");
        stringBuffer10.setLength(40); //установаить длину
        System.out.println(stringBuffer10);
        stringBuffer10.setLength(4); // обрежит до 4 символов
        System.out.println(stringBuffer10);


        System.out.println("------------------");
        StringBuffer stringBuffer11 = new StringBuffer("hello World");
        stringBuffer11.replace(6,11,"java"); //заменить
        System.out.println(stringBuffer11);

        System.out.println("------------------");
        StringBuffer stringBuffer12 = new StringBuffer("hello World");
        stringBuffer12.reverse(); //меняет порядок на оборот
        System.out.println(stringBuffer12);

    }
}
