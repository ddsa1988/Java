package org.s004_control_statements;

public class Power {
    public static void userMain() {
        int e, result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;

            while (e > 0) {
                result *= 2;
                e--;
            }

            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}
