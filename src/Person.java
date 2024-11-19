public class Person implements Comparable {
    private int id;
    private int age;
    private char sex;
    private int salary;

    public Person(int id, char sex, int age, int salary) {
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person)) {
            throw new ClassCastException();
        }
        Person otherPerson = (Person) o;
        return Integer.compare(id, otherPerson.id);
    }

}
