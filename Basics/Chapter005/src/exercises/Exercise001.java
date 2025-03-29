package exercises;

import java.util.Scanner;

public class Exercise001 {
    /*
     * Write a program that reads characters from the keyboard until a period is
     * received. Have the program count the number of spaces. Report the total at
     * the end of the program.
     */
    public static void userMain() {
        int countSpaces = 0;
        var reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type a character from the keyboard: ");
            String inputString = reader.nextLine();

            if (inputString == null || inputString.isEmpty()) {
                continue;
            }

            char inputChar = inputString.charAt(0);

            if (inputChar == '.') {
                break;
            } else if (inputChar == ' ') {
                countSpaces++;
            }
        }

        System.out.printf("You've typed %d spaces.\n", countSpaces);
        reader.close();
    }
}
