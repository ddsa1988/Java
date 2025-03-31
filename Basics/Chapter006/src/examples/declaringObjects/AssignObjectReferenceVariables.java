package examples.declaringObjects;

public class AssignObjectReferenceVariables {
    /*
     * When you assign one object reference variable to another object reference
     * variable, you are not creating a copy of the object, you are only making a
     * copy of the reference.
     */
    public static void userMain() {
        Box b1 = new Box();
        Box b2 = b1;

        b1.width = 10;
        b1.height = 20;
        b1.depth = 15;

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);

        System.out.println();

        b2.width = 75;
        System.out.println("Changed: b2.width = 75\n");

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
    }
}
