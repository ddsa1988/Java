package examples.interfaceBasics;

public class Client implements ICallback {

    public void greeting(String msg) {
        System.out.println("This is a greeting: " + msg);
    }

    @Override
    public void callback(int value) {
        System.out.println("Client called callback with " + value);
    }
}
