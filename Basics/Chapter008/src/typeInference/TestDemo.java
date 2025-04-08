package typeInference;

public class TestDemo {
    public static void userMain() {
        MyClass obj1 = TypeInference.getObj(0);
        MyClass obj2 = TypeInference.getObj(1);
        MyClass obj3 = TypeInference.getObj(2);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

class TypeInference {
    public static MyClass getObj(int which) {
        switch (which) {
            case 0:
                return new MyClass();
            case 1:
                return new FirstDerivedClass();
            default:
                return new SecondDerivedClass();
        }
    }
}

class MyClass {
    int x;
}

class FirstDerivedClass extends MyClass {
    int y;
}

class SecondDerivedClass extends FirstDerivedClass {
    int z;
}