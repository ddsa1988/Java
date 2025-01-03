package org.s004_control_statements;

import java.io.IOException;

public class DoWhileDemo {
    public static void userMain() {
        char ch = ' ';
        char ignore;

        System.out.print("Type a keyboard letter: ");

        try {
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(ch);
    }
}
