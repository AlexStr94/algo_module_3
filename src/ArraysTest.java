import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class ArraysTest {
    private Person[] personArr;
    private Person person3;

    @BeforeEach
    void setUp() {
        Person person1 = new Person(1,'m', 35, 300000);
        Person person2 = new Person(2, 'w', 30, 24000);
        person3 = new Person(3,'m', 35, 290000);
        Person person4 = new Person(4, 'w', 30, 35000);
        personArr = new Person[] {person2, person4, person3, person1};
    }

    @org.junit.jupiter.api.Test
    void testBinarySearch() {
        int result = Arrays.binarySearch(personArr, person3, new CapitalismComparator());
        assertEquals(2, result);
    }

    @org.junit.jupiter.api.Test
    void testBinarySearchWithSlice() {
        int result = Arrays.binarySearch(personArr, 1, 3, person3, new CapitalismComparator());
        assertEquals(2, result);
        result = Arrays.binarySearch(personArr, 0, 1, person3, new CapitalismComparator());
        assertEquals(-2, result);
    }
}