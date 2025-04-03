package examples.varargs;

public class TestDemo4 {
    public static void userMain() {

        Varargs4.vaTest(100, 200, 300);
        Varargs3.vaTest("Two argument: ", 10, 20);
        Varargs4.vaTest(false, true, false, true);
        // Varargs4.vaTest(); // Error: The method vaTest() is ambiguous for the type
        // Varargs4
    }
}
