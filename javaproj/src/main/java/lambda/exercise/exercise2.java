package lambda.exercise;

import lambda.bean.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class exercise2 {
    public static void main(String[] args) {

        Comparator<Person> com = (o1, o2) -> o1.getAge() - o2.getAge();

        TreeSet<Person> set = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());

        set.add(new Person("aaa" , 1));
        set.add(new Person("bbb" , 50));
        set.add(new Person("ccc" , 30));
        set.add(new Person("ddd" , 10));

        System.out.println("set = " + set);
    }
}
