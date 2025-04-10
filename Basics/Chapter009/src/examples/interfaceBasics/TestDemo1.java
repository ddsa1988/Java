package examples.interfaceBasics;

public class TestDemo1 {
    public static void userMain() {
        Client client = new Client();
        ICallback callback = new Client();

        client.callback(20);
        client.greeting("Test");

        callback.callback(20);
    }
}
