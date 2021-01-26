package lambda.interf;

import lambda.bean.Person;

@FunctionalInterface
public interface PersonCreator {
    Person create();
}
