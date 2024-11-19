import java.util.Comparator;

public class CapitalismComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getSalary(), p2.getSalary());
    }

}
