package basics;

public class SimpleInheritance {
    public static void userMain() {
        ClassA objA = new ClassA();
        ClassB objB = new ClassB();

        objA.i = 10;
        objA.j = 20;

        objB.i = 50;
        objB.j = 70;
        objB.k = 35;

        System.out.println("objA: " + objA);
        System.out.println("objB: " + objB);
        System.out.println();

        System.out.println("objA instanceof ClassA: " + (objA instanceof ClassA));
        System.out.println("objA instanceof ClassB: " + (objA instanceof ClassB));
        System.out.println();

        System.out.println("objB instanceof ClassA: " + (objB instanceof ClassA));
        System.out.println("objB instanceof ClassB: " + (objB instanceof ClassB));
        System.out.println();

        System.out.println("objA class: " + objA.getClass());
        System.out.println("objB class: " + objB.getClass());
        System.out.println();

        System.out.println("objA.getClass() == objB.getClass(): " + (objA.getClass() == objB.getClass()));
        System.out.println();

        System.out.println("objA.showij(): " + objA.showIj());
        System.out.println("objB.showij(): " + objB.showIj());
        System.out.println("objB.showK(): " + objB.showK());
        System.out.println("objB.sum(): " + objB.sum());
    }
}
