package org.s007_bitwise_operators.models;

public class ShowBits {
    private final int numberBits;

    public ShowBits(int numberBits) {
        this.numberBits = numberBits;
    }

    public void show(long value) {
        long mask = 1;
        int spacer = 0;

        mask <<= numberBits - 1;

        for (; mask != 0; mask >>>= 1) {
            if ((value & mask) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }

            spacer++;

            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
    }
}
