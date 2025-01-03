package org.s009_methods_and_classes;

import org.s009_methods_and_classes.models.Person;

public class PassObjectsToMethods {
    public static void userMain() {
        Person[] people = {
                new Person("Diego"),
                new Person("Amanda"),
                new Person("Amora"),
                new Person("Ameixa")
        };

        for (Person person : people) {
            printPersonName(person);
        }
    }

    private static void printPersonName(Person person) {
        if(person == null){
            return;
        }

        System.out.printf("Name => %s\n", person.getName());
    }
}