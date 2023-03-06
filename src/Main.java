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

        Comparator<Person> comparator = (o1, o2) -> {
            if (!notLessMaxWord(o1.surname,o2.surname)) {
                if (qWords(o1.surname) > qWords(o2.surname)) {
                    return 1;
                } else if (qWords(o1.surname) < qWords(o2.surname)) {
                    return -1;
                }
            }
            return Integer.compare(o1.age, o2.age);
        };

        Collections.sort(list, comparator);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static boolean notLessMaxWord(String s1, String s2) {
        if ((qWords(s1) >= 3) && (qWords(s2) >= 3)) {
            return true;
        } else return false;
    }

    public static int qWords(String surname) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, surname.split("\\P{IsAlphabetic}+"));
        return set.size();
    }
}