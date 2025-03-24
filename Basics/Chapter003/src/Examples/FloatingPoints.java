package examples;

public class FloatingPoints {
    public static void userMain() {
        String msg = String.format("Float: 32 bits\n min value = %f,\n max value = %f\n", Float.MIN_VALUE,
                Float.MAX_VALUE);
        System.out.println(msg);

        msg = String.format("Double: 64 bits\n min value = %f,\n max value = %f\n", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println(msg);
    }
}
