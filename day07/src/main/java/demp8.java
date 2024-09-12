import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demp8 {
    public static void main(String[] args) {
        try {
            // 1. 使用反射获取Person类的Class对象
            Class<?> personClass = Class.forName("Person");

            // 2. 通过Class对象获取构造函数
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);

            // 3. 使用构造函数动态创建Person对象列表
            List<Person> people = Arrays.asList(
                    (Person) constructor.newInstance("张三", 30),
                    (Person) constructor.newInstance("李四", 25),
                    (Person) constructor.newInstance("王五", 35),
                    (Person) constructor.newInstance("刘六", 20)
            );

            // 4. 利用流式计算过滤出年龄大于25岁的Person对象
            List<Person> filteredPeople = people.stream()
                    .filter(person -> person.getAge() > 25)
                    .collect(Collectors.toList());

            // 打印过滤结果
            filteredPeople.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
