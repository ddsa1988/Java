package org.s009_methods_and_classes;

import org.s009_methods_and_classes.models.Person;

public class ReferenceTypesCallByValue {
    public static void userMain() {
        Person p1 = new Person("Diego");
        Person p2 = new Person("Amanda");

        System.out.println("Main method before swap: ");
        System.out.printf("p1.name => %s, p2.name => %s\n", p1.getName(), p2.getName());

        System.out.println();
        swapPersonName(p1, p2);

        System.out.println("\nMain method after swap: ");
        System.out.printf("p1.name => %s, p2.name => %s\n", p1.getName(), p2.getName());

    }

    private static void swapPersonName(Person p1, Person p2) {
        if (p1 == null || p2 == null){
            return;
        }

        String temp = p1.getName();
        p1.setName(p2.getName());
        p2.setName(temp);

        System.out.println("Inside swap method: ");
        System.out.printf("p1.name => %s, p2.name => %s\n", p1.getName(), p2.getName());
    }
}
