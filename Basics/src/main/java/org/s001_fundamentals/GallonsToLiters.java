package org.s001_fundamentals;

import java.security.InvalidParameterException;

public class GallonsToLiters {
    public static void userMain() {
        float gallons = 10;
        float liters = gallonsToLiters(gallons);

        System.out.printf("%.2f gallons are %.2f litters. + \n", gallons, liters);
    }

    private static float gallonsToLiters(float gallons) {
        if (gallons < 0)
            throw new IllegalArgumentException("'gallons' must be equal or greater than 0.");

        final float multiplier = 3.7854F;

        return gallons * multiplier;
    }
}
