package src.main.java.lesson10.ProjectPerson3;

import src.main.java.lesson10.ProjectPerson.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());

    }
}
