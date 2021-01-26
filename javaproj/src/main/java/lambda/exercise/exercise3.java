package lambda.exercise;

import lambda.bean.Person;
import sun.rmi.server.InactiveGroupException;

import javax.lang.model.SourceVersion;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;

public class exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);

//        list.forEach(x -> System.out.println("x = " + x));
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer = " + integer);
            }
        };

        // lambda表达式
        Consumer<Integer> con1 = x -> System.out.println("x = " + x);
        Consumer<Integer> con3 = System.out::println;


/*        public void println (String x){
            synchronized (this) {
                print(x);
                newLine();
            }
        }*/

        // 方法的引用
        PrintStream print =  System.out;
        con = print::println;
        Consumer<Integer> con2 = System.out::println;

        // 逐渐变态
//        list.forEach(con2);

        // 输出所有的偶数
        list.forEach(x -> {
            if(x%2==0)
                System.out.println("x = " + x);
        });

    }
}
