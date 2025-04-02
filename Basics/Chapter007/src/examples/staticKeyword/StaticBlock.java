package examples.staticKeyword;

public class StaticBlock {
    /*
     * A static block is executed when the class is first loaded. Thus, it is
     * executed before the class can be used for any other purpose.
     */
    public int instanceVariable;
    public static int staticVariable;

    public StaticBlock(int number) {
        instanceVariable = number;
    }

    static {
        staticVariable = 100;
        System.out.println("Static block initialized.");
    }

    @Override
    public String toString() {
        return "StaticAttributes [instanceVariable = " + instanceVariable + ", staticVariable = " + staticVariable
                + "]";
    }
}
