package src.main.java.lesson16.ExPhone;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMxPhone {
    public static void main(String[] args) {


        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("phone22", "Samsung",2000),
                new Phone("phone1", "Apple",5000),
                new Phone("phone333", "Samsung",4000),

                new Phone("phone444", "LG",4500)
        ));
        Phone min = phones.stream().min(Phone::compare).get(); //Phone::compare вызываем наш метод
        Phone max = phones.stream().max(Phone::compare).get();
        System.out.printf("min Name: %s, price: %d \n",min.getName(),min.getPrice());
        System.out.printf("max Name: %s, price: %d \n",max.getName(),max.getPrice());

    }
}
