package org.s005_arrays;

import org.s005_arrays.models.Person;

public class ArrayOfObjectsDemo {
    public static void userMain() {
        Person[] people = {
                new Person("Diego"),
                new Person("Amanda"),
                new Person("Amora"),
                new Person("Ameixa")
        };

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
