package examples.arithmeticOperators;

public class CompoundAssignment {
    public static void userMain() {
        final int ratio = 3;

        {
            int a = 10;
            System.out.println("a = " + a);

            a += ratio;

            System.out.printf("a += %d\na = %d\n", ratio, a);
        }

        System.out.println();

        {
            int a = 10;
            System.out.println("a = " + a);

            a -= ratio;

            System.out.printf("a -= %d\na = %d\n", ratio, a);
        }

        System.out.println();

        {
            int a = 10;
            System.out.println("a = " + a);

            a *= ratio;

            System.out.printf("a *= %d\na = %d\n", ratio, a);
        }

        System.out.println();

        {
            int a = 10;
            System.out.println("a = " + a);

            a /= ratio;

            System.out.printf("a /= %d\na = %d\n", ratio, a);
        }

        System.out.println();

        {
            int a = 10;
            System.out.println("a = " + a);

            a %= ratio;

            System.out.printf("a %%= %d\na = %d\n", ratio, a);
        }
    }
}
