package exercises;

public class Exercise002 {
    // Create a program that prints a conversion table of inches to meters. Display
    // 12 feet of conversions, inch by inch. Output a blank line every 12 inches.
    // (One meter equals approximately 39.37 inches.)

    public static void userMain() {
        final int maxLines = 12;
        int numberConversions = (int) footToInch(12);
        int actualLine = 0;

        for (int i = 0; i < numberConversions; i++) {
            actualLine++;

            float meters = inchToMeter(i);
            String result = String.format("Inches: %d - Meters: %.2f", i, meters);

            System.out.println(result);

            if (actualLine < maxLines)
                continue;

            System.out.println("\n");
            actualLine = 0;
        }
    }

    private static float inchToMeter(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be equal or greater than zero.");
        }

        final float ratio = 1 / 39.37f;
        float meters = value * ratio;

        return meters;
    }

    private static float footToInch(float value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be equal or greater than zero.");
        }

        final float ratio = 12f;
        float inches = value * ratio;

        return inches;
    }
}
