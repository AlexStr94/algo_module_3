import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1,'m', 35, 300000);
        Person person2 = new Person(2, 'w', 30, 24000);
        Person person3 = new Person(3,'m', 35, 290000);
        Person person4 = new Person(4, 'w', 30, 35000);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        System.out.println(Collections.binarySearch(personList, person4));
    }
}