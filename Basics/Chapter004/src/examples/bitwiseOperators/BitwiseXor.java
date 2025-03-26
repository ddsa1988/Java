package examples.bitwiseOperators;

public class BitwiseXor {
    public static void userMain() {
        final byte a = 42;
        final byte b = 15;
        final byte result = a ^ b;

        System.out.printf("Number %d in binary is %s.\n", a, Integer.toBinaryString(a));
        System.out.printf("Number %d in binary is %s.\n", b, Integer.toBinaryString(b));
        System.out.printf("Bitwise 'Xor' between %d ^ %d is %d and in binary is %s.\n", a, b, result,
                Integer.toBinaryString(result));
    };
}
