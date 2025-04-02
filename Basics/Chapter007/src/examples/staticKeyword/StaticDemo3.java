package examples.staticKeyword;

public class StaticDemo3 {
    public static void userMain() {
        System.out.println(StaticMethods.staticVariable);
        StaticMethods.staticVariable = 200;
        System.out.println(StaticMethods.staticVariable);

        var obj1 = new StaticMethods(10);
        var obj2 = new StaticMethods(20);

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);

        System.out.println();

        StaticMethods.PrintStatic();
        System.out.println();
        obj1.PrintAll();
        System.out.println();
        obj2.PrintAll();
    }
}
