package examples.arithmeticOperators;

public class ModulusOperator {
    public static void userMain() {
        final int mod = 10;
        final int a = 42;
        final float b = 42.25f;

        System.out.printf("%d mod %d = %d\n", a, mod, a % mod);
        System.out.printf("%.2f mod %d = %.2f\n", b, mod, b % mod);
    }
}
