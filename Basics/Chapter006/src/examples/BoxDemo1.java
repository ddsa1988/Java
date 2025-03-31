package examples;

public class BoxDemo1 {
    public static void userMain() {
        Box mybox = new Box();

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        double volume = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + volume);
    }
}
