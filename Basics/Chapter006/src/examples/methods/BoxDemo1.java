package examples.methods;

public class BoxDemo1 {
    public static void userMain() {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        System.out.println("myBox1 volume: " + myBox1.getVolume());
        System.out.println("myBox2 volume: " + myBox2.getVolume());
    }
}
