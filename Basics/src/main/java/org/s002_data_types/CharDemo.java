package org.s002_data_types;

public class CharDemo {
    public static void userMain() {
        char myChar = 'A';

        System.out.print(myChar);
        System.out.print(' ');
        System.out.println((int) myChar);

        for (int i = 0; i < 5; i++) {
            System.out.print(++myChar);
            System.out.print(' ');
            System.out.println((int) myChar);
        }
    }
}
