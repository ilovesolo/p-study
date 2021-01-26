package lambda.exercise;

import lambda.bean.Person;

import java.util.ArrayList;

public class exercise4 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("aaa" , 1));
        list.add(new Person("bbb" , 50));
        list.add(new Person("ccc" , 30));
        list.add(new Person("ddd" , 10));

        // lambda
        list.removeIf(x -> x.getAge() > 10);
    }
}
