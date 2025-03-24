package Examples;

public class Integers {
    public static void userMain() {
        String msg = String.format("Byte: 8 bits\n min value = %d,\n max value = %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(msg);

        msg = String.format("Short: 16 bits\n min value = %d,\n max value = %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(msg);

        msg = String.format("Int: 32 bits\n min value = %d,\n max value = %d\n", Integer.MIN_VALUE,
                Integer.MAX_VALUE);
        System.out.println(msg);

        msg = String.format("Long: 64 bits\n min value = %d,\n max value = %d\n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(msg);
    }
}
