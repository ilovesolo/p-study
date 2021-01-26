package lambda.impl;

import lambda.bean.Person;
import lambda.interf.PersonCreator;

public class PersonCreatorImpl {
    public static void main(String[] args) {
        PersonCreator person = () -> new Person();
        PersonCreator person1 = new PersonCreator() {
            @Override
            public Person create() {
                return new Person();
            }
        };
        PersonCreator person2 = () -> new Person();
        PersonCreator persion3 = Person::new;

        // 构造方法的引用
        PersonCreator pcc = Person::new;
        System.out.println("pcc = " + pcc);
        Person a = pcc.create();
        System.out.println("a = " + a);

        PersonCreator2 pcc2 = Person::new;
        Person b = pcc2.create("Jane", 10);
    }
}

interface PersonCreator2{
    Person create(String name, int age);
}
