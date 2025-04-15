package examples.throwsKeyword;

public class Example001 {
    /*
     * If a method is capable of causing an exception that it does not handle, it
     * must specify this behavior so that callers of the method can guard themselves
     * against that exception. You do this by including a throws clause in the
     * method’s declaration.
     */
    public static void userMain() {
        try {
            test();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }

    private static void test() throws Exception {
        System.out.println("Inside test().");
        throw new Exception("This is a exception.");
    }
}
