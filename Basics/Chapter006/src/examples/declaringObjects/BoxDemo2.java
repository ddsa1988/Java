package examples.declaringObjects;

public class BoxDemo2 {
    public static void userMain() {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        double volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("myBox1 volume: " + volume);

        volume = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("myBox2 volume: " + volume);
    }
}
