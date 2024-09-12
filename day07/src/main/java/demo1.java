import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class demo1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<CustomInteger> customIntegers = Arrays.asList(
                new CustomInteger(5, "Five"),
                new CustomInteger(10, "Ten"),
                new CustomInteger(3, "Three"),
                new CustomInteger(20, "Twenty")
        );

        // 使用流式计算找出最大值
        Optional<CustomInteger> maxCustomInteger = customIntegers.stream()
                .max((ci1, ci2) -> Integer.compare(ci1.getValue(), ci2.getValue()));

        if (maxCustomInteger.isPresent()) {
            CustomInteger maxInteger = maxCustomInteger.get();
            System.out.println("Max value: " + maxInteger.getValue());

            // 使用反射获取属性
            Field descriptionField = CustomInteger.class.getDeclaredField("description");
            descriptionField.setAccessible(true); // 如果字段是私有的，需要设置为可访问
            String description = (String) descriptionField.get(maxInteger);
            System.out.println("Description of max value: " + description);
        } else {
            System.out.println("List is empty.");
        }
    }
}