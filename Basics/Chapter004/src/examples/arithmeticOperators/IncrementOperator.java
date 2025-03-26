package examples.arithmeticOperators;

public class IncrementOperator {
    public static void userMain() {
        {
            int a = 10;

            System.out.println("a = " + a);
            System.out.println("a++ = " + a++);
            System.out.println("a = " + a);
        }

        System.out.println();

        {
            int a = 10;

            System.out.println("a = " + a);
            System.out.println("++a = " + ++a);
            System.out.println("a = " + a);
        }
    }
}
