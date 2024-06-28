package src.main.java.lesson10.ProjectPerson;

public class Person implements Comparable<Person>{ // чтобы сравнить
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override //чтобы сравнить ( имлеменитруем) выше implements Comparable<Person>
    public int compareTo(Person person) {
      //  return name.compareTo(person.getName()); чтобы ошибки не было
        return name.length() -person.getName().length(); //сравнение по длине имени
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
