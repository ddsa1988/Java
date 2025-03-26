package examples.bitwiseOperators;

public class ShiftLeft {
    public static void userMain() {
        {
            final byte a = 64;
            final int b = a << 2;
            final byte c = (byte) b;

            System.out.printf("a [byte] => %d, binary %s.\n", a, Integer.toBinaryString(a));
            System.out.printf("b [int] => a << 2: %d, binary %s.\n", b, Integer.toBinaryString(b));
            System.out.printf("c (byte)b => %d, binary %s.\n", c, Integer.toBinaryString(c));
        }

        System.out.println();

        {
            int num = 0xFFFFFFE;

            for (int i = 0; i < 4; i++) {
                num <<= 1;
                System.out.println(num);
            }
        }
    }
}
