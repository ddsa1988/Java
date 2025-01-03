package org.s007_bitwise_operators;

public class XorDemo {
    // XOR, will set a bit on if, and only if, the bits being compared are different
    public static void userMain() {
        byte n1 = 0b0000101;
        byte n2 = 0b0001010;
        byte n3 = (byte) (n1 ^ n2);
        byte n4 = (byte) (n3 ^ n1);
        byte n5 = (byte) (n3 ^ n2);

        System.out.printf("n1 = %s\n", showBits(n1));
        System.out.printf("n2 = %s\n", showBits(n2));
        System.out.printf("n1 ^ n2 = %s\n", showBits(n3));
        System.out.printf("n3 ^ n1 = %s\n", showBits(n4));
        System.out.printf("n3 ^ n2 = %s\n", showBits(n5));
    }

    private static String showBits(byte number) {
        StringBuilder sb = new StringBuilder();

        for (int i = Byte.MAX_VALUE + 1; i > 0; i = i / 2) {
            if ((number & i) != 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }

        return sb.toString();
    }
}
