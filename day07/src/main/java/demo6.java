import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo6 {
    public static void main(String[] args) {
        List<Object> objects = Arrays.asList(
                new TypeA("ZS"),
                new TypeB(10),
                new TypeA("LS"),
                new TypeB(20)
        );

        // 使用流式API和反射根据类型进行不同的操作  
        List<String> results = objects.stream()
                .map(obj -> {
                    Class<?> clazz = obj.getClass();
                    try {
                        if (clazz.equals(TypeA.class)) {
                            // 假设TypeA有一个getName()方法  
                            Method getNameMethod = clazz.getMethod("getName");
                            return (String) getNameMethod.invoke(obj) + " is of type TypeA";
                        } else if (clazz.equals(TypeB.class)) {
                            // 假设TypeB有一个getAge()方法
                            Method getValueMethod = clazz.getMethod("getAge");
                            int value = (int) getValueMethod.invoke(obj);
                            return "TypeB age: " + value;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return "Unknown type";
                })
                .collect(Collectors.toList());

        // 打印结果  
        results.forEach(System.out::println);
    }
}