package src.main.java.lesson16.Grouping;

import src.main.java.lesson16.ExPhone.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PortioningBy { // сортировка по условию каком то ( через лямда выражение)
    public static void main(String[] args) {
        Stream<Phone> phoneStream =Stream.of(
                new Phone("phone1","apple",300),
                new Phone("phone3333","Samsung",200),
                new Phone("phone5555","Samsung",300),
                new Phone("phone444","Xiaomi",2500)
        );

        Map<Boolean, List<Phone>> phonesByCompany  = phoneStream.collect(
                Collectors.partitioningBy(p->p.getCompany()=="apple"));  //условие  через лямда выражение

        for (Map.Entry<Boolean,List<Phone>> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey());
            for (Phone phone:item.getValue()){
                System.out.println(phone.getName());
            }
            System.out.println();
        }

    }
}
