import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person> {

    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

}
