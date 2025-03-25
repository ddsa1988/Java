package examples.arithmeticOperators;

public class BasicIntegerArithmetic {
    public static void userMain() {
        System.out.println("Basic Integer Arithmetic\n");

        {
            final int a = 10;
            final int b = 2;

            System.out.printf("%d + %d = %d\n", a, b, a + b);
            System.out.printf("%d - %d = %d\n", a, b, a - b);
            System.out.printf("%d * %d = %d\n", a, b, a * b);
            System.out.printf("%d / %d = %d\n", a, b, a / b);
        }

        System.out.println();

        {
            final int a = 10;
            final int b = 0;

            System.out.printf("%d / %d = %d\n", b, a, b / a);

            try {
                System.out.printf("%d / %d = ", a, b);
                System.out.print((a / b) + "\n");
            } catch (ArithmeticException e) {
                System.out.println(e.toString());
            }

            try {
                System.out.printf("%d / %d = ", b, b);
                System.out.print((b / b) + "\n");
            } catch (ArithmeticException e) {
                System.out.println(e.toString());
            }
        }
    }
}
