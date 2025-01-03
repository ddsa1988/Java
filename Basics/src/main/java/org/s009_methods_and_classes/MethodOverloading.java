package org.s009_methods_and_classes;

public class MethodOverloading {
    public static void userMain() {
        int a, b, c, d;
        a = b = c = d = 5;

        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        System.out.println(sum(a, b, c, d));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
