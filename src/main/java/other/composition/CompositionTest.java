package other.composition;

public class CompositionTest {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA", "12345");
        Person person = new Person("John Doe", address);

        System.out.println(person.getName() + " lives at " + person.getAddress().getStreet());
    }
}

