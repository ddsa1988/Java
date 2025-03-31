package exercises;

public class Exercise005 {
    // Factorial
    public static void userMain() {
        System.out.println(GetFactorial(10));
        PrintFactorial(15);
    }

    private static long GetFactorial(long number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Parameter must be greater than zero.");
        }

        long result = 1;

        for (long i = 0; i <= number; i++) {
            if (i > 1) {
                result *= i;
            }
        }

        return result;
    }

    private static void PrintFactorial(long number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Parameter must be greater than zero.");
        }

        long result = 1;

        for (long i = 0; i <= number; i++) {
            if (i > 1) {
                result *= i;
            }

            System.out.print(result + " ");
        }

        System.out.println();
    }
}
