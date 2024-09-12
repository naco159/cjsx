import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        Class<?> clazz = TargetClass.class; // 替换为你想要检查的类  

        // 获取类中声明的所有方法（包括私有方法）  
        Method[] methods = clazz.getDeclaredMethods();

        // 使用流式计算筛选出public方法并统计数量  
        long publicMethodCount = Arrays.stream(methods)
                .filter(method -> Modifier.isPublic(method.getModifiers()))
                .count();

        System.out.println("public方法数 " + clazz.getSimpleName() + ": " + publicMethodCount);
    }
}


class TargetClass {
    public void publicMethod1() {
        // ...  
    }

    protected void protectedMethod() {
        // ...  
    }

    void packagePrivateMethod() {
        // ...  
    }

    private void privateMethod() {
        // ...  
    }

    public int publicMethod2(int x) {
        return x;
    }
}