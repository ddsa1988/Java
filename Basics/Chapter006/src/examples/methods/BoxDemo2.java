package examples.methods;

public class BoxDemo2 {
    public static void userMain() {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.setDimensions(10, 20, 15);
        myBox2.setDimensions(3, 6, 9);

        System.out.println("myBox1 volume: " + myBox1.getVolume());
        System.out.println("myBox2 volume: " + myBox2.getVolume());
    }
}
