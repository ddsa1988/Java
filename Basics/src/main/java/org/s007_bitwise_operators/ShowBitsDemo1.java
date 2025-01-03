package org.s007_bitwise_operators;

public class ShowBitsDemo1 {
    public static void userMain() {
        // Display the bits within a byte.
        byte value = 123;

        for (int i = Byte.MAX_VALUE + 1; i > 0; i = i / 2) {
            if ((value & i) != 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
