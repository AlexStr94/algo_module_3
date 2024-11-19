import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {


    @Test
    void testBinarySearch() {
        Person person1 = new Person(1,'m', 35, 300000);
        Person person2 = new Person(2, 'w', 30, 24000);
        Person person3 = new Person(3,'m', 35, 290000);
        Person person4 = new Person(4, 'w', 30, 35000);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        int result = Collections.binarySearch(personList, person4);
        assertEquals(3, result);
    }

    @Test
    void testBinarySearchWithComparator() {
        Person person1 = new Person(1,'m', 35, 300000);
        Person person2 = new Person(2, 'w', 30, 24000);
        Person person3 = new Person(3,'m', 35, 290000);
        Person person4 = new Person(4, 'w', 30, 35000);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(person4);
        personList.add(person3);
        personList.add(person1);
        int result = Collections.binarySearch(personList, person4, new CapitalismComparator());
        assertEquals(1, result);
    }
}