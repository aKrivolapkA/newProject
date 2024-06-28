package src.main.java.lesson11.Oczeredi.Person;


public class Person implements Comparable<src.main.java.lesson10.ProjectPerson.Person> {
    private String name;


    public Person(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    @Override //чтобы сравнить ( имлеменитруем) выше implements Comparable<Person>
    public int compareTo(src.main.java.lesson10.ProjectPerson.Person person) {
        //  return name.compareTo(person.getName()); чтобы ошибки не было
        return name.length() - person.getName().length(); //сравнение по длине имени
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

