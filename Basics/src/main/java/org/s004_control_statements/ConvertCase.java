package org.s004_control_statements;

import java.io.IOException;

public class ConvertCase {
    public static void userMain() {
        char ch;
        char ignore;

        System.out.print("Type a keyboard letter: ");

        try {
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            System.out.println(convertCase(ch));

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    private static char convertCase(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 32);
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        } else {
            return ch;
        }
    }
}
