package org.s007_bitwise_operators;

public class ShiftDemo {
    public static void userMain() {
        int value = 1;

        for (int i = 0; i < 8; i++) {
            System.out.println(showBits(value));
            value <<= 1;
        }

        System.out.println();

        value = 128;

        for (int i = 0; i < 8; i++) {
            System.out.println(showBits(value));
            value >>= 1;
        }

    }

    private static String showBits(int number) {
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