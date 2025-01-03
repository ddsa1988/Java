package org.s010_inheritance.models;

public class Shape {
    public static int counter;
    public double width;
    public double height;

    static {
        counter = 0;
    }

    public Shape() {
        counter++;
    }
}
