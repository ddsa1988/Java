package examples.bitwiseOperators;

public class ShiftRight {
    public static void userMain() {
        {
            int a = 35;
            System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

            a >>= 1;
            System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

            a >>= 1;
            System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));
        }

        System.out.println();

        {
            int a = -16;
            System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

            a >>= 1;
            System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

            a >>= 1;
            System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));
        }

        System.out.println();

        {
            {
                int a = -1;
                System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

                a >>= 1;
                System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));

                a >>= 12;
                System.out.printf("%d => binary %s.\n", a, Integer.toBinaryString(a));
            }
        }
    }
}
