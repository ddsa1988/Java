package exercises;

public class Exercise006 {
    // Fibonacci
    public static void userMain() {
        System.out.println(GetFibonacci(10));
        PrintFibonacci(14);
    }

    private static long GetFibonacci(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Parameter must be greater or equal to zero.");
        }

        long next = 1;
        long actual = 0;

        for (int i = 0; i < number; i++) {
            long sum = actual + next;
            actual = next;
            next = sum;
        }

        return actual;
    }

    private static void PrintFibonacci(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Parameter must be greater or equal to zero.");
        }

        long next = 1;
        long actual = 0;

        for (int i = 0; i <= number; i++) {
            System.out.print(actual + " ");

            long sum = actual + next;
            actual = next;
            next = sum;
        }
    }
}
