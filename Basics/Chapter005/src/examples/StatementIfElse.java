package examples;

import java.util.Scanner;

public class StatementIfElse {
    public static void userMain() {
        final int number = 10;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type something: ");
        String text = reader.nextLine();

        int textLength = text.length();

        if (textLength > number) {
            System.out.printf("The text typed has a length of %d that is greater than %d.\n", textLength, number);
        } else {
            System.out.printf("The text typed has a length of %d that is less than %d.\n", textLength, number);
        }

        reader.close();
    }
}
