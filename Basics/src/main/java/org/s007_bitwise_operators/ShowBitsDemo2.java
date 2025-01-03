package org.s007_bitwise_operators;

import org.s007_bitwise_operators.models.ShowBits;

public class ShowBitsDemo2 {
    public static void userMain() {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.print("123 in binary: ");
        b.show(123);

        System.out.print("\n87987 in binary: ");
        i.show(87987);

        System.out.print("\n237658768 in binary: ");
        li.show(237658768);
        System.out.println();
    }
}
