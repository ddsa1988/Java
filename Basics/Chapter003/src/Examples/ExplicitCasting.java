package examples;

public class ExplicitCasting {
    // Implicit casting can be done when the two types are incompatible or the
    // destination type is smaller than the source type
    public static void userMain() {
        final int anInt = 257;
        final byte aByte = (byte) anInt; // 257 - 256 (Byte range) = 1
        final double aDouble = 323.57;
        final short aShort = (short) aDouble;
        final Byte anotherByte = (byte) aShort; // 323 - 256 (Byte range) = 67

        String msg = String.format("Int a = %d, Byte b = %d", anInt, aByte);
        System.out.println(msg);

        msg = String.format("Double a = %.2f, Short b = %d", aDouble, aShort);
        System.out.println(msg);

        msg = String.format("Short a = %d, Byte b = %d", aShort, anotherByte);
        System.out.println(msg);
    }
}
