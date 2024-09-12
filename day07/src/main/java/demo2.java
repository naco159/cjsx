import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<Person> people = Arrays.asList(
                new Person("张三", 25, "A"),
                new Person("李四", 35, "A"),
                new Person("王五", 40, "A"),
                new Person("刘六", 20, "A")
        );


        List<Person> filteredPeople = people.stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());

        Field cityField = Person.class.getDeclaredField("rank");
        cityField.setAccessible(true);

        for (Person person : filteredPeople) {
            cityField.set(person, "S");
        }

        filteredPeople.forEach(person -> {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", rank: " + person.getCity());
        });
    }
}