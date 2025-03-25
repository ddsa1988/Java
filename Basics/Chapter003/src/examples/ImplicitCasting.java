package examples;

public class ImplicitCasting {
    // Implicit casting can be done when the two types are compatible and the
    // destination type is larger than the source type
    public static void userMain() {
        final short aShort = Short.MAX_VALUE;
        final int anInt = aShort;

        final float aFloat = Float.MAX_VALUE;
        final double aDouble = aFloat;

        String msg = String.format("Short a = %d, Int b = %d", aShort, anInt);
        System.out.println(msg);

        msg = String.format("Float a = %f, Double b = %f", aFloat, aDouble);
        System.out.println(msg);
    }
}
