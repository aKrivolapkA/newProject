package src.main.java.lesson10.ProjectPerson3;

import src.main.java.lesson10.ProjectPerson.Person;
import src.main.java.lesson10.ProjectPerson2.PersonComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonProject3 {
    public static void main(String[] args) {

        Comparator <Person> personComparator = new PersonComparator() //сначала сравнение по имени
                .thenComparing(new PersonAgeComparator()); // потом сравнене по возрасту

        TreeSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Toь",23));
        people.add(new Person("Mich",20));
        people.add(new Person("Tom",22));
        people.add(new Person("Bill",26));
        for (Person person :people){
            System.out.println(person.getName() + " - "+ person.getAge());
        }
    }
}
