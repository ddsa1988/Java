package models;

import java.util.Random;

public class RandomNumber {
    private static final Random random;

    static {
        random = new Random();
    }

    private RandomNumber() {
    }

    public static int getNextInt(int start, int end) {
        if (start > end) {
            start = start + end;
            end = start - end;
            start = start - end;
        }

        return random.nextInt(start, end + 1);
    }
}
