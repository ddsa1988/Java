package basics;

public class ReferenceDemo {
    /*
     * It is important to understand that it is the type of the reference
     * variable—not the type of the object that it refers to—that determines what
     * members can be accessed. That is, when a reference to a subclass object is
     * assigned to a superclass reference variable, you will have access only to
     * those parts of the object defined by the superclass.
     */
    public static void userMain() {
        Box box = new Box();
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        BoxColor colorBox = new BoxColor(10, 9, 5, 4);

        box = weightBox;
        System.out.println(box);
        // System.out.println(box.weight); Compile error because box does not define
        // weight member

        box = colorBox;
        System.out.println(box);
        // System.out.println(box.color); Compile error because box does not define
        // color member
    }
}
