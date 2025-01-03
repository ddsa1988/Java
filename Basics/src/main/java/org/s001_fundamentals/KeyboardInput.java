package org.s001_fundamentals;

import java.util.Scanner;

public class KeyboardInput {
    public static void userMain() {

        {
            System.out.print("Type something: ");
            try {
                int userInput = System.in.read();
                System.out.printf("You've typed the character '%s'.", (char) userInput);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println();

        {
            Scanner reader = new Scanner(System.in);

            System.out.print("Type something: ");
            String userInput = reader.next();

            System.out.printf("You've typed '%s'.", userInput);

            reader.close();
        }
    }
}