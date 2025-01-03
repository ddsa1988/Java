package org.s009_methods_and_classes.models;

public class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        boolean isNameValid = name != null && !name.trim().isEmpty();

        if (!isNameValid) {
            throw new IllegalArgumentException("name can't be null or empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Name: " + getName();
    }
}
