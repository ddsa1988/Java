package org.s009_methods_and_classes.models;

public class StaticBlock {
    public static double number;

    static {
        System.out.println("Inside static block.");
        number = 10;
    }

    public StaticBlock(String msg) {
        System.out.println(msg);
    }
}
