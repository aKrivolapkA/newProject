package src.main.java.lesson16.ExPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PhoneSorted {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones,"Ahone1","ahone1","phone333","phone55555","phone4444"); //Collections.addAll чтобы добавить жлементы в лист
        phones.stream()
                .filter(phone -> phone.length()<8)
                .sorted() //сортировка стринга по  алфовиту, цифрам и берет большую букву вперед
                .forEach(System.out::println);


    }
}
