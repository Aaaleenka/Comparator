import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("Алена", "Миклухо-Маклай", 31);
        Person p2 = new Person("Михаил", "Коробков", 34);
        Person p3 = new Person("Иван", "Кро-пот-ниц-кий", 15);
        Person p4 = new Person("Олег", "Во-ро-бь-ев", 25);
        Person p5 = new Person("Олег", "Иванов-Коробков-Сидоров", 17);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        Collections.sort(list, new PersonNewComparator(3));
        Collections.reverse(list);
        System.out.println(list);
    }
}