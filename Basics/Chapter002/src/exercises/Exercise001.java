package exercises;

import java.util.Scanner;

public class Exercise001 {
    // The moon’s gravity is about 17 percent that of earth’s. Write a program that
    // computes your effective weight on the moon.

    public static void userMain() {
        Scanner reader = new Scanner(System.in);
        float weightOnEarth = 0;

        while (true) {
            System.out.print("Type the weight on Earth: ");
            String userInput = reader.nextLine();

            try {
                weightOnEarth = Float.parseFloat(userInput);

                boolean isWeightValid = weightOnEarth >= 0;

                if (!isWeightValid) {
                    System.out.println("Value must equal or greater than zero.");
                    continue;
                }

                float weightOnMoon = GetWeightOnMoon(weightOnEarth);

                String msg = String.format("The weight of %.2f on Earth is %.2f on Moon.", weightOnEarth,
                        weightOnMoon);

                System.out.println(msg);

                break;

            } catch (Exception e) {
                System.out.println("Value must be a number.");
            }
        }

        reader.close();
    }

    private static float GetWeightOnMoon(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be equal or greater than zero.");
        }

        final float ratio = 17f / 100f;
        float weightOnMoon = value * ratio;

        return weightOnMoon;
    }
}
