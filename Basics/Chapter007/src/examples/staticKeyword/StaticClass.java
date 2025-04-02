package examples.staticKeyword;

public final class StaticClass {
    // Final keyword prevents inheritance
    public int instanceVariable; // Can never access this variable
    public static int staticVariable;

    private StaticClass() {
        // Private construct prevents instantiation
    }

    public void PrintAll() {
        // Can never access this method
        System.out.println("instanceVariable = " + instanceVariable);
        System.out.println("staticVariable = " + staticVariable);
    }

    public static void PrintStatic() {
        System.out.println("staticVariable = " + staticVariable);
    }
}
