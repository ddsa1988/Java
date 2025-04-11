package examples.defaultMethods;

public interface DefaultMethods {
    public static void userMain() {
        MyClass obj = new MyClass();

        obj.printSomething();
        obj.print();
    }
}

class MyClass implements IMyInterface {

    @Override
    public void printSomething() {
        System.out.println("This method was implemented.");
    }

}

interface IMyInterface {
    public void printSomething();

    public default void print() {
        System.out.println("This is a default method.");
    }
}
