package examples.returnObjects;

public class TestDemo {
    public static void userMain() {
        Test obj1 = new Test(2);
        Test obj2 = obj1.incrByTen();

        System.out.println("obj1 => " + obj1);
        System.out.println("obj2 => " + obj2);

        obj2 = obj2.incrByTen();

        System.out.println("After second increase obj2 => " + obj2);
    }

    private static class Test {
        public int a;

        public Test(int num) {
            a = num;
        }

        public Test incrByTen() {
            Test temp = new Test(a + 10);

            return temp;
        }

        @Override
        public String toString() {
            return "Test [a = " + a + "]";
        }
    }
}
