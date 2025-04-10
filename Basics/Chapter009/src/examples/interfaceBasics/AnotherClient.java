package examples.interfaceBasics;

public class AnotherClient implements ICallback {

    public void greeting(String msg) {
        System.out.println("This is a greeting: " + msg);
    }

    @Override
    public void callback(int value) {
        System.out.println("Another client called callback with " + value);
    }
}
