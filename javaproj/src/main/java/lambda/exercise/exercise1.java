package lambda.exercise;

import lambda.bean.Person;

import java.util.ArrayList;

public class exercise1 {
    // 集合排序
    // ArrayList
    public static void main(String[] args) {
        // person对象 年龄 降序
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("aaa" , 1));
        personList.add(new Person("bbb" , 50));
        personList.add(new Person("ccc" , 30));
        personList.add(new Person("ddd" , 10));

//        personList.sort((o1, o2) -> {
//            return o1.getAge() - o2.getAge();
//        });

        personList.sort((o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(personList);
    }
}
