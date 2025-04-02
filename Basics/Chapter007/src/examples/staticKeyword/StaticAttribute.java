package examples.staticKeyword;

public class StaticAttribute {
    public int instanceVariable;
    public static int staticVariable;

    public StaticAttribute(int number) {
        instanceVariable = number;
    }

    @Override
    public String toString() {
        return "StaticAttributes [instanceVariable = " + instanceVariable + ", staticVariable = " + staticVariable
                + "]";
    }
}
