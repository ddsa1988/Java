package org.s003_operators;

public class ShortCircuitDemo {
    // && => evaluate until the first operand is false
    // || => evaluate until the first operand is true
    // & => evaluates all operands
    // || => evaluates all operands
    public static void userMain() {
        {
            int a = 0;

            if (false & (++a < 10)) {
                System.out.println("Inside if statement");
            }
            System.out.println(a);
        }

        {
            int a = 0;

            if (false && (++a < 10)) {
                System.out.println("Inside if statement");
            }
            System.out.println(a);
        }

        {
            int a = 10;
            int b = 0;

            if (b != 0 && (a % b) == 0) {
                System.out.println("Done");
            }
        }

        {
            int a = 10;
            int b = 0;

            try {
                if (b != 0 & (a % b) == 0) {
                    System.out.println("Done");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}