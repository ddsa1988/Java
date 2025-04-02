package examples.staticKeyword;

public class StaticMethods {
    public int instanceVariable;
    public static int staticVariable;

    public StaticMethods(int number) {
        instanceVariable = number;
    }

    static {
        staticVariable = 100;
        System.out.println("Static block initialized.");
    }

    public void PrintAll() {
        System.out.println("instanceVariable = " + instanceVariable);
        System.out.println("staticVariable = " + staticVariable);
    }

    public static void PrintStatic() {
        // System.out.println("instanceVariable = " + instanceVariable); // Error:
        // Cannot make a static reference to the non-static field instanceVariable
        System.out.println("staticVariable = " + staticVariable);
    }

    @Override
    public String toString() {
        return "StaticAttributes [instanceVariable = " + instanceVariable + ", staticVariable = " + staticVariable
                + "]";
    }
}
