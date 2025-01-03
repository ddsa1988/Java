package org.s005_arrays;

import java.util.Arrays;
import java.util.Random;

public class FindAverage {
    public static void userMain() {
        final int CAPACITY = 5;
        final int MIN_NUMBER = 0;
        final int MAX_NUMBER = 100;

        double[] numbers = new double[CAPACITY];
        double sum = 0;

        Random random = new Random();

        for (int i = 0; i < CAPACITY; i++) {
            numbers[i] = random.nextDouble(MIN_NUMBER, MAX_NUMBER);
        }

        for (double value : numbers) {
            sum += value;
        }

        double avg = sum / CAPACITY;

        System.out.printf("Numbers: %s\n", Arrays.toString(numbers));
        System.out.printf("Average = %.2f\n", avg);
    }
}