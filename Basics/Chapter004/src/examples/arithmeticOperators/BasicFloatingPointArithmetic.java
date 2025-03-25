package examples.arithmeticOperators;

public class BasicFloatingPointArithmetic {
    public static void userMain() {
        System.out.println("Basic Floating POint Arithmetic\n");

        {
            final float a = 10f;
            final float b = 2f;

            System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
            System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
            System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
            System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
        }

        System.out.println();

        {
            final float a = 10f;
            final float b = 0f;

            System.out.printf("%.2f / %.2f = %.2f\n", b, a, b / a);
            System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
            System.out.printf("%.2f / %.2f = %.2f\n", b, b, b / b);
        }
    }
}
