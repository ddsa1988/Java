package org.s009_methods_and_classes;

public class VarArgsDemo {
    public static void userMain() {
        String greeting = "hello";
        System.out.println(sum(greeting, 0, 1, 2, 3, 4, 5));
        System.out.println();

        greeting = "Morning";
        System.out.println(sum(greeting, 100, 200));
    }

    private static int sum(String msg, int... numbers) {
        int sum = 0;

        if (numbers == null) {
            return sum;
        }
        System.out.println(msg);

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
