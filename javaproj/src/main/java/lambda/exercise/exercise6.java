package lambda.exercise;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class exercise6 {
    public static void main(String[] args) {

        double x = 2;
        double y = 3;

        BiConsumer<Double, Double> bc = (a, b) -> Math.pow(a, b);
        bc.accept(x, y);

        BiFunction<Double, Double, Double> bf = Math::pow;
        System.out.println(Math.pow(2.0, 3.0));
        System.out.println("bf.apply(2, 3) = " + bf.apply(2.0, 3.0));
    }
}
