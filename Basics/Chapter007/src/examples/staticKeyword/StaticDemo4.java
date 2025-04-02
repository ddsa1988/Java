package examples.staticKeyword;

public class StaticDemo4 {
    public static void userMain() {
        System.out.println(StaticClass.staticVariable);
        StaticClass.staticVariable = 200;
        System.out.println(StaticClass.staticVariable);

        StaticClass.PrintStatic();
    }
}
