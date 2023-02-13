import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class PersonNewComparator implements Comparator<Person> {

    protected int maxWord;

    public PersonNewComparator(int maxWord) {
        this.maxWord = maxWord;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (!notLessMaxWord(o1.surname, o2.surname)) {
            if (qWords(o1.surname) > qWords(o2.surname)) {
                return 1;
            } else if (qWords(o1.surname) < qWords(o2.surname)) {
                return -1;
            }
        }
        return Integer.compare(o1.age, o2.age);
    }

    protected boolean notLessMaxWord(String s1, String s2) {
        if ((qWords(s1) >= maxWord) && (qWords(s2) >= maxWord)) {
            return true;
        } else return false;
    }

    protected int qWords(String surname) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, surname.split("\\P{IsAlphabetic}+"));
        return set.size();
    }

}
