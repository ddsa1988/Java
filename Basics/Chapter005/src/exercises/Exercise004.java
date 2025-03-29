package exercises;

import java.util.Scanner;

public class Exercise004 {
    /*
     * The ASCII lowercase letters are separated from the uppercase letters by 32.
     * Thus, to convert a lowercase letter to uppercase, subtract 32 from it. Use
     * this information to write a program that reads characters from the keyboard.
     * Have it convert all lowercase letters to uppercase,and all uppercase letters
     * to lowercase, displaying the result. Make no changes to any other
     * character. Have the program stop when the user enters a period. At the end,
     * have the program display the number of case changes that have taken place.
     */
    public static void userMain() {
        final int uppercaseMinValue = 'A';
        final int uppercaseMaxValue = 'Z';
        final int lowercaseMinValue = 'a';
        final int lowercaseMaxValue = 'z';

        var reader = new Scanner(System.in);
        int countChanges = 0;

        while (true) {
            System.out.print("Type a character from the keyboard: ");
            String inputString = reader.nextLine();

            if (inputString == null || inputString.isEmpty()) {
                continue;
            }

            char inputChar = inputString.charAt(0);

            if (inputChar == '.') {
                break;
            }

            if (inputChar >= uppercaseMinValue && inputChar <= uppercaseMaxValue) {
                countChanges++;
                inputChar += 32;

            } else if (inputChar >= lowercaseMinValue && inputChar <= lowercaseMaxValue) {
                countChanges++;
                inputChar -= 32;
            }

            System.out.println("Converted to: " + inputChar + "\n");
        }

        System.out.println("Character changes: " + countChanges);
        reader.close();
    }
}
