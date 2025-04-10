package examples.partialImplementation;

public abstract class Client implements ICallback {

    public void greeting(String msg) {
        System.out.println("This is a greeting: " + msg);
    }
}
