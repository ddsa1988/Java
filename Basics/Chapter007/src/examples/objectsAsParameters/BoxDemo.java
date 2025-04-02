package examples.objectsAsParameters;

public class BoxDemo {
    public static void userMain() {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(myBox1);

        System.out.println(myBox1);
        System.out.println(myBox2);
        System.out.println();

        myBox1.width = 18;
        myBox2.depth = 27;

        System.out.println(myBox1);
        System.out.println(myBox2);
    }
}
