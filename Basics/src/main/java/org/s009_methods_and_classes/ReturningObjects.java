package org.s009_methods_and_classes;

import org.s009_methods_and_classes.models.Person;

public class ReturningObjects {
    public static void userMain() {
        Person p1 = createPerson("Diego");
        Person p2 = createPerson("Amanda");

        System.out.println(p1);
        System.out.println(p2);
    }

    private static Person createPerson(String name) {
        boolean isNameValid = name != null && !name.trim().isEmpty();

        if (!isNameValid) {
            throw new IllegalArgumentException("name can't be null or empty.");
        }

        return new Person(name);
    }
}
