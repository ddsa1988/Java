package examples.interfaceInheritance;

public class InterfaceInheritance {
    public static void userMain() {
        Methods methods = new Methods();

        methods.method1();
        methods.method2();
        methods.method3();
    }
}

class Methods implements IMethodB {

    @Override
    public void method1() {
        System.out.println("Unimplemented method 'method1'");
    }

    @Override
    public void method2() {
        System.out.println("Unimplemented method 'method2'");
    }

    @Override
    public void method3() {
        System.out.println("Unimplemented method 'method3'");
    }
}

interface IMethodA {
    public void method1();

    public void method2();
}

interface IMethodB extends IMethodA {
    public void method3();
}
