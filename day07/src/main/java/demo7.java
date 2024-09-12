import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo7 {
    public static void main(String[] args) {
        try {
            // 使用反射获取Person类的构造器  
            Class<?> personClass = Class.forName("Person");
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);

            // 动态创建一组Person对象  
            List<Person> people = Arrays.asList(
                    (Person) constructor.newInstance("张三", 30),
                    (Person) constructor.newInstance("李四", 25),
                    (Person) constructor.newInstance("王五", 35),
                    (Person) constructor.newInstance("刘六", 20)
            );

            // 使用流式API对Person对象进行排序  
            List<Person> sortedPeople = people.stream()
                    .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                    .collect(Collectors.toList());

            // 打印排序后的Person列表  
            System.out.println("Sorted by age:");
            sortedPeople.forEach(System.out::println);

            // 使用流式API对Person对象进行过滤  
            List<Person> filteredPeople = people.stream()
                    .filter(person -> person.getAge() > 25)
                    .collect(Collectors.toList());

            // 打印过滤后的Person列表  
            System.out.println("\nFiltered by age > 25:");
            filteredPeople.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}