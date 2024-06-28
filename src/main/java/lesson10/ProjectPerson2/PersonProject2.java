package src.main.java.lesson10.ProjectPerson2;

import src.main.java.lesson10.ProjectPerson.Person;

import java.util.TreeSet;

public class PersonProject2 {
    public static void main(String[] args) {

        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> people = new TreeSet<>(personComparator); //personComparator передаем условие сортировки
        people.add(new Person("Tom"));
        people.add(new Person("Dan"));
        people.add(new Person("Shon"));
        for (Person person : people){
            System.out.println(person);
        }

    }
}
