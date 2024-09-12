import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo3 {
    public static void main(String[] args) {

        List<String> classNames = Arrays.asList(
                "ClassA",
                "ClassB",
                "ClassC"
        );

        // 加载类，创建实例，并筛选出实现了MyInterface的实例  
        List<MyInterface> instances = classNames.stream()
                .map(className -> {
                    try {
                        Class<?> clazz = Class.forName(className);
                        Object instance = clazz.getDeclaredConstructor().newInstance();
                        if (instance instanceof MyInterface) {
                            return (MyInterface) instance;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                })
                .filter(instance -> instance != null)
                .collect(Collectors.toList());

        // 对筛选出的实例执行某些操作
        instances.forEach(MyInterface::doSomething);
    }
}