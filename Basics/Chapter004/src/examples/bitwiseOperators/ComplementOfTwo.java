package examples.bitwiseOperators;

public class ComplementOfTwo {
    /*
     * Java uses an encoding known as two’s complement, which means that negative
     * numbers are represented by inverting (changing 1’s to 0’s and vice versa) all
     * of the bits in a value, then adding 1 to the result.
     */
    public static void userMain() {
        String msg = "";

        final byte a = 42;
        msg = String.format("Number %d in binary is %s.", a, Integer.toBinaryString(a));
        System.out.println(msg);

        final byte b = ~a; // Invert all bits
        msg = String.format("Number %d in binary is %s.", b, Integer.toBinaryString(b));
        System.out.println(msg);

        final byte c = ~a + 1; // Invert all bits and add 1 (complement of two)
        msg = String.format("Number %d in binary is %s.", c, Integer.toBinaryString(c));
        System.out.println(msg);

        final byte d = ~c;
        msg = String.format("Number %d in binary is %s.", d, Integer.toBinaryString(d));
        System.out.println(msg);

        final byte e = ~c + 1;
        msg = String.format("Number %d in binary is %s.", e, Integer.toBinaryString(e));
        System.out.println(msg);
    }
}
