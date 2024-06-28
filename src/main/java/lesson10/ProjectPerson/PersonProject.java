package src.main.java.lesson10.ProjectPerson;

import src.main.java.lesson10.ProjectPerson.Person;

import java.util.TreeSet;

public class PersonProject {
    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("To"));
        people.add(new Person("Dan"));
        people.add(new Person("Shon"));
        for (Person person : people){
            System.out.println(person);
        }


    }
}
