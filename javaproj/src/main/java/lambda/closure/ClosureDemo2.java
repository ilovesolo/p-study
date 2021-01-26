package lambda.closure;

import java.util.function.Consumer;

public class ClosureDemo2 {
    public static void main(String[] args) {
        int a = 10;
        Consumer<Integer> con = x -> System.out.println("a = " + a);
        con.accept(a);
    }
}
