package org.s004_control_statements;

public class SquareRoot {
    public static void userMain() {
        for (double i = 1.0; i < 10.0; i++) {
            double sqrRoot = Math.sqrt(i);

            System.out.printf("Square root of %.2f is %.2f: ", i, sqrRoot);
            System.out.println();

        }
    }
}
