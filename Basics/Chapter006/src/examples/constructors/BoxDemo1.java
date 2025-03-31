package examples.constructors;

public class BoxDemo1 {
    public static void userMain() {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        System.out.println("myBox1 volume: " + myBox1.getVolume());
        System.out.println("myBox2 volume: " + myBox2.getVolume());
    }
}
