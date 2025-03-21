package firstApp;

import java.util.Scanner;

public class FirstApp {
    public static void userMain() {
        Scanner reader = new Scanner(System.in);

        System.out.println("***** Gallon to liters converter *****\n");

        while (true) {
            float gallon = 0;

            System.out.print("Type the gallon value: ");
            String userInput = reader.nextLine();

            try {
                gallon = Float.parseFloat(userInput);

                boolean isGallonValid = gallon >= 0;

                if (!isGallonValid) {
                    System.out.println("Value must equal or greater than zero.");
                    continue;
                }

                float liter = gallonToLiters(gallon);

                String result = String.format("%.2f gallons is %.2f liters.", gallon, liter);

                System.out.println(result);

                break;
            } catch (Exception e) {
                System.out.println("Value must be a number.");
            }
        }

        reader.close();
    }

    private static float gallonToLiters(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be greater or equal to zero");
        }

        final float ratio = 3.7541f;
        float liter = value * ratio;

        return liter;
    }
}
