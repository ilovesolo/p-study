package lambda.closure;

import java.util.function.Supplier;

public class ClosureDemo {
    public static void main(String[] args) {
        String a = getName().get();
        System.out.println("a = " + a);

        // getName()已经执行完毕，为什么.get()还能拿到局部变量name呢
    }

    private static Supplier<String> getName() {
        String name = "jean";
//        return () -> name;
        return () -> {
            // 闭包可以提升一个变量的声明周期
            return name;
        };
    }
}
